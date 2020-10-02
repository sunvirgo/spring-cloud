package com.sunvirgo.springcloud;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/17 22:19
 **/
public class mainTest {
    public static void main(String[] args) {
        String x= new SpringCloudApplication().b;
        String y = SpringCloudApplication.d;
        SpringCloudApplication.d="g";
        System.out.println(SpringCloudApplication.d);
    }
}
