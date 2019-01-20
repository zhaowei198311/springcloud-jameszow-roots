package com.jameszow.zuul.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述:
 * Zuul启动类
 *
 * @author James Zow
 * @create 2019-01-20 21:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class zuulApplication {
    public static void main(String [] args){
        SpringApplication.run(zuulApplication.class,args);
    }
}