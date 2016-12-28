package org.clayman.comparison.tomcat.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomIntController {

    private static final Random RANDOM = new Random();

    @RequestMapping("/ping")
    public Integer ping() {
        return RANDOM.nextInt();
    }
}
