package com.sunvirgo.eurekacustomer.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/10/2 20:17
 **/
@Service
public class ProviderBackHystrixForRestTemplate {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "back")
    public String aliveForRest() {
        // 自动处理URL
        String url ="http://provider/User/aliveForRest";
        String object = restTemplate.getForObject(url, String.class);
        return object;

    }


    public String back() {

        return "请求失败~bbb...";
    }

}
