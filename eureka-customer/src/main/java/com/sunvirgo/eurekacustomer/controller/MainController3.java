///*
//package com.sunvirgo.eurekacustomer;
//
//import com.netflix.discovery.EurekaClient;
//import com.sun.org.apache.bcel.internal.generic.RETURN;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.net.URI;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.Random;
//import java.util.concurrent.atomic.AtomicInteger;
//
//*/
///**
// * 类说明:
// *
// * @author : 黄刚
// * @date : 2020/9/7 23:30
// **//*
//
//@RestController
//public class MainController3 {
//    @Autowired
//    */
///**抽象*//*
//
//    DiscoveryClient client;
//    @Qualifier("eurekaClient")
//    @Autowired
//    EurekaClient client2;
//    @Autowired
//    LoadBalancerClient lb;
//    @Autowired
//    RestTemplate restTemplate;
//
//
//    @GetMapping("/client10")
//    public Object client10(){
//        String url = "http://PROVIDER/getHi";
//        String respStr = restTemplate.getForObject(url, String.class);
//        ResponseEntity<String> entity = restTemplate.getForEntity(url,String.class);
//        System.out.println(entity);
//        return respStr;
//    }
//
//    @GetMapping("/client11")
//    public Object client11(){
//        String url = "http://PROVIDER/getMap";
//        Map<String,String> map = restTemplate.getForObject(url, Map.class);
//        System.out.println(map);
//        return map;
//    }
//
//    @GetMapping("/client12")
//    public Object client12(){
//        String url = "http://PROVIDER/getObj";
//        Person person = restTemplate.getForObject(url, Person.class);
//        System.out.println(person);
//        return person;
//    }
//
//    @GetMapping("/client13")
//    public Object client13(){
//        String url = "http://PROVIDER/getObj2?name={1}";
//        Person person = restTemplate.getForObject(url, Person.class,"maxiaoliu");
//        System.out.println(person);
//        return person;
//    }
//
//    @GetMapping("/client14")
//    public Object client14(){
//        String url = "http://PROVIDER/getObj2?name={name}";
//        Person person = restTemplate.getForObject(url, Person.class, Collections.singletonMap("name","666"));
//        System.out.println(person);
//        return person;
//    }
//
//    @GetMapping("/client15")
//    public Object client15(HttpServletResponse response) throws IOException {
//        String url ="http://provider/postParam";
//        Map<String, String> map = Collections.singletonMap("name", "memeda");
//        URI location = restTemplate.postForLocation(url, map, Person.class);
//        System.out.println("location:"+location);
//        response.sendRedirect(location.toURL().toString());
//        return null;
//    }
//}
//*/
