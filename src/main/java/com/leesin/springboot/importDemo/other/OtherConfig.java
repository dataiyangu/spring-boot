package com.leesin.springboot.importDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 9:18
 * @version: ${VERSION}
 * @modified By:
 */
@Configuration
public class OtherConfig {

    @Bean
    public OtherBean otherBean() {
        return new OtherBean();
    }
}
