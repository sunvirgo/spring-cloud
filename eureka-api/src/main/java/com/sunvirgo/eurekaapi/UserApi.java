package com.sunvirgo.eurekaapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/13 19:12
 **/
//@RequestMapping("/User") hystrix这里需要注意需要防止踩坑，上面加这个会导致项目注册两次报错
public interface UserApi {
    String lineName = "/User";
    /**
     * 方法说明: 查看当前服务状态
     * @author : 黄刚
     * @date : 2020/9/13 19:21
     * @para : []
     * @return : java.lang.String
     */ 
    @GetMapping(lineName+"/alive")
    public String alive();

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 19:22
     * @para : []
     * @return : java.lang.String
     */ 
    @GetMapping(lineName+"/register")
    public String register();

    /**
     * 方法说明: <p color='red'>通过过ID获取用户名称</p>
     * @author : 黄刚
     * @date : 2020/9/13 19:26
     * @para : []
     * @return : java.lang.String
     */
    @GetMapping(lineName+"/getById")
    public String getById(String id);

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/9/13 21:48
     * @para : [id]
     * @return : java.lang.String
     */
    @GetMapping(lineName+"/getPerson")
    public String getPerson(Person person);

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 16:10
     * @para : [id]
     * @return : java.util.Map<java.lang.Integer,java.lang.String>
     */
    @GetMapping(lineName+"/getMap")
    Map<Integer, String> getMap(@RequestParam("id") Integer id);
    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 16:10
     * @para : [id, name]
     * @return : java.util.Map<java.lang.Integer,java.lang.String>
     */
    @GetMapping(lineName+"/getMap2")
    Map<Integer, String> getMap2(@RequestParam("id") Integer id,@RequestParam("name") String name);

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 16:10
     * @para : [map]
     * @return : java.util.Map<java.lang.Integer,java.lang.String>
     */
    @GetMapping(lineName+"/getMap3")
    Map<Integer, String> getMap3(@RequestParam Map<String, Object> map);

    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 16:10
     * @para : [map]
     * @return : java.util.Map<java.lang.Integer,java.lang.String>
     */
    @PostMapping(lineName+"/postMap")
    Map<Integer, String> postMap(Map<String, Object> map);


    /**
     * 方法说明:
     * @author : 黄刚
     * @date : 2020/10/2 17:07
     * @para : [person]
     * @return : java.util.Map<java.lang.Integer,java.lang.String>
     */
    @PostMapping(lineName+"/postPerson")
    Person postPerson(Person person);

}
