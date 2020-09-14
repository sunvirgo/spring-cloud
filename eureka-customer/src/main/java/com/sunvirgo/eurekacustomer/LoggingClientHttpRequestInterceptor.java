package com.sunvirgo.eurekacustomer;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * 类说明:
 *
 * @author : 黄刚
 * @date : 2020/9/11 0:14
 **/
public class LoggingClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {
        @Override
        public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution)
                throws IOException {
            System.out.println("拦截啦！！！");
            System.out.println(request.getURI());
            ClientHttpResponse response = execution.execute(request, body);
            System.out.println(response.getHeaders());
            return response;
        }

    }
