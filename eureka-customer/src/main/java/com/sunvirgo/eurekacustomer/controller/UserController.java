package com.sunvirgo.eurekacustomer.controller;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import com.sunvirgo.eurekacustomer.hystrix.ProviderBackHystrixForRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 17:23
 **/
@RestController
public class UserController {
    @Resource
    UserApi api;
    @Autowired
    ProviderBackHystrixForRestTemplate restTemplate;

    @GetMapping("/aliveForRest")
    public String aliveForRest(){
        return restTemplate.aliveForRest();
    }

    @GetMapping("/alive")
    public String alive(){
        return api.alive();
    }

    @GetMapping("/getById/{id1}")//@PathVariable("id")
    public String getById(String id){
        return api.getById(id);
    }

    @GetMapping("/getPerson")
    public String getPerson(){
        return api.getPerson(new Person());
    }

    @GetMapping("/map")
    public Map<Integer, String> getMap(@RequestParam("id") Integer id) {
        System.out.println(id);
        return api.getMap(id);
    }

    @GetMapping("/map2")
    public Map<Integer, String> getMap2(Integer id,String name) {
        System.out.println(id);
        return api.getMap2(id,name);
    }


    @GetMapping("/map3")
    public Map<Integer, String> getMap3(@RequestParam Map<String, Object> map) {
//		System.out.println(id);
//		HashMap<String, Object> map = new HashMap<>(2);
//
//		map.put("id", id);
//		map.put("name", name);
//		syso
        System.out.println(map);
        return api.getMap3(map);
    }


    @GetMapping("/map4")
    public Map<Integer, String> getMap4(@RequestParam Map<String, Object> map) {
//		System.out.println(id);
//		HashMap<String, Object> map = new HashMap<>(2);
//
//		map.put("id", id);
//		map.put("name", name);
//		syso
        System.out.println(map);
        return api.postMap(map);
    }

    @GetMapping("/postPerson")
    public Person postPerson(@RequestParam Map<String, Object> map) {
        Person person =new Person();
        person.setId(map.get("id").toString());
        person.setName(map.get("name").toString());
        System.out.println(person.toString());
        return api.postPerson(person);
    }
}
