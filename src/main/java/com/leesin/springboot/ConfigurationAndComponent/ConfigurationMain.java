package com.leesin.springboot.ConfigurationAndComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 8:50
 * @version: ${VERSION}
 * @modified By:
 */
@ComponentScan//默认当前包下
public class ConfigurationMain {
    public static void main(String[] args) {
        // AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        // Demo bean = applicationContext.getBean(Demo.class);  //DL 依赖查找
        // bean.say();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationMain.class);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println(beanDefinitionNames[i]);
        }
    }

}
