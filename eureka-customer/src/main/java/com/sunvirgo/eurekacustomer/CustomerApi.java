package com.sunvirgo.eurekacustomer;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类说明:这种方式和restTemplate的区别-没有代码侵入，方便做异构系统
 * 1.不结合eureka，自定义一个client名字，就用URL属性指定服务器列表 url ="http://localhost:80"
 * 2. 结合eureka name = "provider"
 * @author : 黄刚
 * @date : 2020/9/13 17:42
 **/
//@FeignClient(name = "ooo", url ="http://localhost:80" )
@FeignClient(name = "provider" )
public interface CustomerApi extends UserApi {
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 18:21
     * @para : []
     * @return : java.lang.String
     */ 
    @Override
    @GetMapping("/alive")
    public String alive ();

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 18:22
     * @para : []
     * @return : java.lang.String
     */
    @Override
    @GetMapping("/getById")
    String getById(@RequestParam("id") String id);


    @Override
    @GetMapping("/getPerson")
    public String getPerson(@RequestParam("person") Person person);
}
