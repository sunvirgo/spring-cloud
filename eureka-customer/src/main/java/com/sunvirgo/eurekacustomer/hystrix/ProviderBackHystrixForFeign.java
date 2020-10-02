package com.sunvirgo.eurekacustomer.hystrix;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekacustomer.CustomerApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * 类说明:整合Feign熔断降级类
 *
 * @author : 黄刚
 * @date : 2020/10/2 20:19
 **/
@Component
public class ProviderBackHystrixForFeign implements CustomerApi {

    @Override
    public String alive() {
        return "降级了！";
    }

    @Override
    public String register() {
        return null;
    }

    @Override
    public String getById(String id) {
        return null;
    }

    @Override
    public String getPerson(Person person) {
        return null;
    }

    @Override
    public Map<Integer, String> getMap(Integer id) {
        return null;
    }

    @Override
    public Map<Integer, String> getMap2(Integer id, String name) {
        return null;
    }

    @Override
    public Map<Integer, String> getMap3(Map<String, Object> map) {
        return null;
    }

    @Override
    public Map<Integer, String> postMap(Map<String, Object> map) {
        return null;
    }

    @Override
    public Person postPerson(Person person) {
        return null;
    }
}
