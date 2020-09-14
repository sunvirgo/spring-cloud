package com.sunvirgo.eurekacustomer;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 17:23
 **/
@RestController
public class UserController {
    @Autowired
    UserApi api;

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
}
