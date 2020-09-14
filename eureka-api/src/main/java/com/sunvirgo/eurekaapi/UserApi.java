package com.sunvirgo.eurekaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 19:12
 **/
@RequestMapping("/User")
public interface UserApi {
    /**
     * 方法说明: 查看当前服务状态
     * @author : 黄刚
     * @date : 2020/9/13 19:21
     * @para : []
     * @return : java.lang.String
     */ 
    @GetMapping("/alive")
    public String alive();

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 19:22
     * @para : []
     * @return : java.lang.String
     */ 
    @GetMapping("/register")
    public String register();

    /**
     * 方法说明: <p color='red'>通过过ID获取用户名称</p>
     * @author : 黄刚
     * @date : 2020/9/13 19:26
     * @para : []
     * @return : java.lang.String
     */
    @GetMapping("/getById")
    public String getById(String id);

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 21:48
     * @para : [id]
     * @return : java.lang.String
     */
    @GetMapping("/getPerson")
    public String getPerson(Person person);
}
