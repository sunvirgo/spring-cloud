package com.sunvirgo.eurekacustomer.hystrix;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekacustomer.CustomerApi;
import feign.FeignException;
import feign.hystrix.FallbackFactory;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Map;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/10/2 21:45
 **/
@Component
public class ProviderBackFactory implements FallbackFactory<CustomerApi> {
    @Override
    public CustomerApi create(Throwable throwable) {
        return new CustomerApi() {
            @Override
            public String alive() {
                System.out.println(ToStringBuilder.reflectionToString(throwable));
                System.out.println("ProviderBackFactory.alive.throwable:"+throwable);
                throwable.printStackTrace();
                if(throwable instanceof FeignException.InternalServerError){
                    return "远程服务器500！\n"+throwable.getLocalizedMessage();
                }
                return "进入降级工厂类！";
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

            @Override
            public String register() {
                return null;
            }
        };
    }
}
