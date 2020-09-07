package com.sunvirgo.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication_euk2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_euk2.class, args);
    }

}
