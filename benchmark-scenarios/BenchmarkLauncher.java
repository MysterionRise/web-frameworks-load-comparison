import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BenchmarkLauncher {

    private static final String FIRST_CASE  = "ab -s 120 -c 1000 -n 1000000 -r http://localhost:8080/ping";
    private static final String SECOND_CASE = "ab -s 120 -c 5000 -n 5000000 -r http://localhost:8080/ping";
    private static final String THIRD_CASE  = "ab -s 120 -c 10000 -n 10000000 -r http://localhost:8080/ping";

    public static void main(String[] args) throws Exception {
        Map<Character, String> map = new HashMap<>();
        map.put('1', FIRST_CASE);
        map.put('2', SECOND_CASE);
        map.put('3', THIRD_CASE);

        if (args.length != 2) {
            throw new IllegalArgumentException("Specify arguments, all cases (from 1 to 3, no spaces between)" +
                    " and launch count then, e.g. `123 10`");
        }
        String casesToLaunch = args[0];
        Integer launchCount = Integer.valueOf(args[1]);

        for (char caseNumber : casesToLaunch.toCharArray()) {
            String command = map.get(caseNumber);
            if (command == null) {
                System.out.println("No case for number " + caseNumber);
                continue;
            }

            List<Double> rpsList = new ArrayList<>();
            for (int i = 0; i < launchCount; i++) {
                Process process = Runtime.getRuntime().exec(command);
                BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = input.readLine()) != null) {
                    if (line.contains("Requests per second")) {
                        Double rps = Double.valueOf(line.replaceAll("[^\\.0123456789]",""));
                        rpsList.add(rps);
                    }
                }
                input.close();
            }
            OptionalDouble average = rpsList.stream().mapToDouble(Double::doubleValue).average();
            System.out.printf("Avg rps for case #%c is %.0f \r\n", caseNumber, average.getAsDouble());
        }
    }
}

