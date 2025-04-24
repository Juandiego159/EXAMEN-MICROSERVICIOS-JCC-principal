package com.jcc.jccconfigservidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class jccConfigServidorApplication {

    public static void main(String[] args) {
        SpringApplication.run(jccConfigServidorApplication.class, args);
    }

}



