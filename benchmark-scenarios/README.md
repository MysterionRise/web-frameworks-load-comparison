This folder contains benchmark scenarios:

Shell scripts for manual single launches

For multiple launches with average rps count use BenchmarkLauncher.java

prerequisites:
* JDK8

how-to:
* ```javac BenchmarkLauncher.java```
* ```java -cp . BenchmarkLauncher 'cases' 'launchCount'```

e.g. use ```java -cp . BenchmarkLauncher 123 10``` to get report about all cases and 10 launches each

Testing machine is:
* motherboard - Z97-HD3
* cpu - Intel(R) Core(TM) i5-4690 CPU @ 3.50GHz
* RAM - 2*8GiB DIMM DDR3 Synchronous 1600 MHz (0.6 ns)
* SSD - KINGSTON SV300S3
