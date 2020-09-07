package com.sunvirgo.eurekacustomer;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/7 23:30
 **/
@RestController
public class MainController {
    @Autowired
    /**抽象*/
    DiscoveryClient client;
    @Qualifier("eurekaClient")
    @Autowired
    EurekaClient client2;
    @Autowired
    LoadBalancerClient lb;

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:54
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/getHi")
    public String getHi(){
        return "Hi";
    }
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:54
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/client")
    public String client1(){
        List<String> services = client.getServices();
        for(String str : services){
            System.out.println(str);
        }
        return "Hi";
    }
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:54
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/client2")
    public Object client2(){
        return client.getInstances("provider");
    }

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:54
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/client3")
    public Object client3(){
        List<ServiceInstance> instances = client.getInstances("provider");
        for(ServiceInstance ins : instances){
            System.out.println(ToStringBuilder.reflectionToString(ins));
        }
        return "xxoo";
    }
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:56
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/client4")
    public Object client4(){
        //具体服务
        //List<InstanceInfo> instances = client2.getInstancesById("localhost:provider:80");
        //使用服务名找列表
        List<InstanceInfo> instances = client2.getInstancesByVipAddress("provider",false);
        for(InstanceInfo ins : instances){
            System.out.println(ToStringBuilder.reflectionToString(ins));
        }
        if(instances.size() > 0){
            InstanceInfo instance = instances.get(0);
            if(instance.getStatus() == InstanceInfo.InstanceStatus.UP){
                String url = "http://" + instance.getHostName()+":"+instance.getPort()+"/getHi";
                System.out.println("url:"+url);
                RestTemplate restTemplate =new RestTemplate();
                String respStr = restTemplate.getForObject(url, String.class);
                System.out.println("respStr:"+respStr);
            }
        }
        return "xxoo";
    }
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/3 0:05
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/client5")
    public Object client5(){
        //ribbon 完成客户端的额负载均衡，过滤掉down了的节点
        ServiceInstance instance = lb.choose("provider");
        String url = "http://" + instance.getHost()+":"+instance.getPort()+"/getHi";
        RestTemplate restTemplate =new RestTemplate();
        String respStr = restTemplate.getForObject(url, String.class);
        System.out.println("respStr:"+respStr);
        return "xxoo";
    }
}
