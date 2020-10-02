package com.sunvirgo.eurekaprovider;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 17:22
 **/
@RestController
@RequestMapping("/User")
public class UserController implements UserApi {
    @Value("${server.port}")
    String port;
    private AtomicInteger count = new AtomicInteger();


    @Override
    @GetMapping("/register")
    public String register() {
        return null;
    }

    @Override
    @GetMapping("/getById")
    public String getById(String id) {
        return "wanbuer";
    }

    @Override
    @GetMapping("/getPerson")
    public String getPerson(Person person) {
        return "66666";
    }

    @Override
    @GetMapping("/alive")
    public String alive() {

       /* try {
            System.out.println("准备睡");

            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        int x=1/0;

        int i = count.getAndIncrement();
        System.out.println("====好的，Port:"+port+"第：" + i + "次调用");
        return "port:" + port;
    }
    @Override
    @GetMapping("/getMap")
    public Map<Integer, String> getMap(@RequestParam("id") Integer id) {
        // TODO Auto-generated method stub
        System.out.println(id);
        return Collections.singletonMap(id, "mmeme");
    }
    @Override
    @GetMapping("/getMap2")
    public Map<Integer, String> getMap2(Integer id,String name) {
        // TODO Auto-generated method stub
        System.out.println(id);
        return Collections.singletonMap(id, name);
    }
    @Override
    @GetMapping("/getMap3")
    public Map<Integer, String> getMap3(@RequestParam Map<String, Object> map) {
        // TODO Auto-generated method stub
        System.out.println(map);
        return Collections.singletonMap(Integer.parseInt(map.get("id").toString()), map.get("name").toString());
    }

    @Override
    @PostMapping("/postMap")
    public Map<Integer, String> postMap(@RequestBody Map<String, Object> map) {
        // TODO Auto-generated method stub
        System.out.println(map);
        return Collections.singletonMap(Integer.parseInt(map.get("id").toString()), map.get("name").toString());
    }

    @Override
    @PostMapping("/postPerson")
    public Person postPerson(@RequestBody Person person) {
        // TODO Auto-generated method stub
        System.out.println(person.toString());
        return person;
    }

}
