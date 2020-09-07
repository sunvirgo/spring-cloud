package com.sunvirgo.eurekaprovider;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
}
