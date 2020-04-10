package com.leesin.springboot.factories;

import com.leesin.lalala.ConfigDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 11:41
 * @version: ${VERSION}
 * @modified By:
 */
@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Test.class, args);
        System.out.println(run.getBean(ConfigDemo.class));
    }
}
