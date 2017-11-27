package com.kousenit.election;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@SpringBootApplication
public class ElectionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElectionApplication.class, args);
    }
}
