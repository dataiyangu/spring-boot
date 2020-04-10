package com.leesin.springboot.importDemo.current;

import com.leesin.springboot.importDemo.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 9:14
 * @version: ${VERSION}
 * @modified By:
 */
@Configuration
@Import(OtherConfig.class)
public class CurrentConfig {
    @Bean
    public CurrentBean currentBean() {
        return new CurrentBean();
    }
}
