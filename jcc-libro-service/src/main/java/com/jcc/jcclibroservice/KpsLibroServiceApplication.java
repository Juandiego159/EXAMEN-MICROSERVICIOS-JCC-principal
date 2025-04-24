package com.jcc.jcclibroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KpsLibroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KpsLibroServiceApplication.class, args);
    }

}
