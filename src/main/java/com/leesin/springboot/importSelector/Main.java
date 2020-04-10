package com.leesin.springboot.importSelector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 10:43
 * @version: ${VERSION}
 * @modified By:
 */
@SpringBootApplication
@EnableDefineService
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext ca = SpringApplication.run(Main.class, args);

        System.out.println(ca.getBean(A.class));
        System.out.println(ca.getBean(B.class));
    }
}

