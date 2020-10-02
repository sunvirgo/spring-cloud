package com.sunvirgo.eurekacustomer;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import com.sunvirgo.eurekacustomer.hystrix.ProviderBackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 类说明:这种方式和restTemplate的区别-没有代码侵入，方便做异构系统
 * 1.不结合eureka，自定义一个client名字，就用URL属性指定服务器列表 url ="http://localhost:80"
 * 2. 结合eureka name = "provider"
 * @author : 黄刚
 * @date : 2020/9/13 17:42
 **/
//@FeignClient(name = "ooo", url ="http://localhost:80" )
//@FeignClient(name = "provider", fallback = ProviderBackHystrixForFeign.class)
@FeignClient(name = "provider", fallbackFactory = ProviderBackFactory.class)//使用工厂模式
public interface CustomerApi extends UserApi {
    String lineName = "/User";
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 18:21
     * @para : []
     * @return : java.lang.String
     */ 
    @Override
    @GetMapping(lineName+"/alive")
    public String alive ();

    /**
     * 方法说明:这是Feign本身的BUG，需要加上@RequestParam("id")才能运行
     * @RequestParam("id")是用来给Feign看的
     * @author : 黄刚
     * @date : 2020/9/13 18:22
     * @para : []
     * @return : java.lang.String
     */
    @Override
    @GetMapping(lineName+"/getById")
    String getById(@RequestParam("id") String id);


    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 17:02
     * @para : [person]
     * @return : java.lang.String
     */
    @Override
    @GetMapping(lineName+"/getPerson")
    public String getPerson(@RequestParam("person") Person person);

    @Override
    @GetMapping(lineName+"/getMap")
    Map<Integer, String> getMap(@RequestParam("id") Integer id);

    @Override
    @GetMapping(lineName+"/getMap2")
    Map<Integer, String> getMap2(@RequestParam("id") Integer id,@RequestParam("name") String name);

    @Override
    @GetMapping(lineName+"/getMap3")
    Map<Integer, String> getMap3(@RequestParam Map<String, Object> map);

    @Override
    @PostMapping(lineName+"/postMap")
    Map<Integer, String> postMap(Map<String, Object> map);


    @Override
    @PostMapping(lineName+"/postPerson")
    Person postPerson(@RequestBody Person person);
}
