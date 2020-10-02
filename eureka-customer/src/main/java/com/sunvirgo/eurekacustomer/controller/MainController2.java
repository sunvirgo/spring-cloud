///*
//package com.sunvirgo.eurekacustomer;
//
//import com.netflix.appinfo.InstanceInfo;
//import com.netflix.discovery.EurekaClient;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import javax.annotation.Resource;
//import java.util.List;
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
//public class MainController2 {
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
//    */
///**
//     * 方法说明:
//     * @author : 黄刚
//     * @date : 2020/9/3 0:05
//     * @para : []
//     * @return : java.lang.Object
//     *//*
//
//    @GetMapping("/client6")
//    public Object client6(){
//        //ribbon 完成客户端的额负载均衡，过滤掉down了的节点
//        ServiceInstance instance = lb.choose("provider");
//        String url = "http://"+instance.getServiceId()+":"+instance.getPort()+"/getHi";
//        String respStr = restTemplate.getForObject(url, String.class);
//        System.out.println("respStr:"+respStr);
//        return respStr;
//    }
//
//    @Autowired
//    DiscoveryClient discoveryClient;
//    @GetMapping("/client7")
//    public Object client7(){
//        List<ServiceInstance> instances = discoveryClient.getInstances("provider");
//        System.out.println("instances"+instances);
//        //随机
//        int nextInt = new Random().nextInt(instances.size());
//        AtomicInteger atomicInteger = new AtomicInteger();
//        //轮询
//        int i=atomicInteger.getAndIncrement();
//        instances.get(i%instances.size());
//        //权重
//        for(ServiceInstance serviceInstance:instances){
//            serviceInstance.getMetadata();//1-9权重
//        }
//        ServiceInstance instance = instances.get(nextInt);
//        String url = "http://"+instance.getServiceId()+":"+instance.getPort()+"/getHi";
//        String respStr = restTemplate.getForObject(url, String.class);
//        System.out.println("respStr:"+respStr);
//        return respStr;
//    }
//
//
//    @GetMapping("/client8")
//    public Object client8(){
//        //ribbon 完成客户端的额负载均衡，过滤掉down了的节点
//        ServiceInstance instance = lb.choose("provider");
//        String url = "http://"+instance.getServiceId()+":"+instance.getPort()+"/getHi";
//        String respStr = restTemplate.getForObject(url, String.class);
//        System.out.println("respStr:"+respStr);
//        return respStr;
//    }
//
//    @GetMapping("/client9")
//    public Object client9(){
//        //自动处理=URL
//        ServiceInstance instance = lb.choose("provider");
//        String url = "http://PROVIDER:80/getHi";
//        String respStr = restTemplate.getForObject(url, String.class);
//        System.out.println("respStr:"+respStr);
//        return respStr;
//    }
//}
//*/
