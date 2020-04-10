package com.leesin.springboot.ConfigurationAndComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 8:50
 * @version: ${VERSION}
 * @modified By:
 */
@Configuration
public class ConfigurationDemo {
    @Bean//默认单例，不会每次new 一个，托管到了spring
    //这个方法名最好跟类名一样
    public Demo demo() {
        return new Demo();
    }
}
