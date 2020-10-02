package com.sunvirgo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudApplication {

    private String a = "a";
    public String b = "b";
    private static String c = "c";
    public static String d = "d";
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudApplication.class, args);
    }

}
