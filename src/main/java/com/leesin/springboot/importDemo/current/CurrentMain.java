package com.leesin.springboot.importDemo.current;

import com.leesin.springboot.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 9:14
 * @version: ${VERSION}
 * @modified By:
 */
public class CurrentMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CurrentConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }
}

