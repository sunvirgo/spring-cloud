package com.sunvirgo.eurekacustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class EurekaCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomerApplication.class, args);
    }
    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new LoggingClientHttpRequestInterceptor());
        return restTemplate;
    }*/
   /* @Bean
    public IRule myRule() {
        return new RoundRobinRule();//轮询
       *//* return new RandomRule();//随机
        return new WeightedResponseTimeRule();//权重
        return new RetryRule();
        return new BestAvailableRule();
        return new AvailabilityFilteringRule();
        return new ZoneAvoidanceRule();*//*
    }*/
}
