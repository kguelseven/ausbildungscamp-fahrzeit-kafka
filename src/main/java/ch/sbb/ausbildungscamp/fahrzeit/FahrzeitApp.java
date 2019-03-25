/*
 * Copyright (C) Schweizerische Bundesbahnen SBB, 2019.
 */

package ch.sbb.ausbildungscamp.fahrzeit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FahrzeitApp {
    public static void main(final String[] args) {
        SpringApplication.run(FahrzeitApp.class, args);
    }
}