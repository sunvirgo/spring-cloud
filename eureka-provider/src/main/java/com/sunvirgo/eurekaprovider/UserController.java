package com.sunvirgo.eurekaprovider;

import com.sunvirgo.eurekaapi.Person;
import com.sunvirgo.eurekaapi.UserApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 17:22
 **/
@RestController
public class UserController implements UserApi {
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 19:21
     * @para : []
     * @return : java.lang.String
     */ 
    @Override
    @GetMapping("/alive")
    public String alive(){
        return "ok";
    }

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
}
