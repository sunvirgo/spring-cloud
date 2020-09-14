package com.sunvirgo.eurekaprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/7 23:30
 **/
@RestController
public class MainController {
    @Value("${server.port}")
    String port;
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/2 23:54
     * @para : []
     * @return : java.lang.Object
     */
    @GetMapping("/getHi")
    public String getHi(){
        return "Hi! port:"+port;
    }

    @GetMapping("/getMap")
    public Map<String,String> getMap(){
        return Collections.singletonMap("id","100");
    }

    @GetMapping("/getObj")
    public Person getObj(){
        Person person = new Person("100","xiao6");
        return person;
    }

    @GetMapping("/getObj2")
    public Person getObj2(String name){
        Person person = new Person("100",name);
        return person;
    }

    @PostMapping("/postParam")
    public URL postParam(@RequestBody Person person, HttpServletResponse response) throws Exception {
        URL uri = new URL("https://www.baidu.com/s?wd="+person.getName());
        response.addHeader("Location", uri.toString());
        return uri;
    }

    @Autowired
    HealthStatusService hsrv;
    @GetMapping("/health")
    public String health(@RequestParam("status") Boolean status){
        hsrv.setStatus(status);
        return hsrv.getStatus();
    }
}
