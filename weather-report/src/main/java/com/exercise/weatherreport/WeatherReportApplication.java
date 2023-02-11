package com.exercise.weatherreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: Jonathan
 * @createDate: 2023/02/11
 */
@SpringBootApplication
@EnableScheduling
public class WeatherReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherReportApplication.class, args);
    }

}
