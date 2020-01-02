package com.lbo.code.timeqinsociety;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("com.lbo")
@EnableTransactionManagement
@SpringBootApplication
public class TimeQinSocietyApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeQinSocietyApplication.class, args);
    }

}
