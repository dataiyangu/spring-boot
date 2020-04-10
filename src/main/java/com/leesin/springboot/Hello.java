package com.leesin.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 8:41
 * @version: ${VERSION}
 * @modified By:
 */
@RestController
public class Hello {
    @RequestMapping("/dadada")
    public String hello() {
        return "dadada";
    }
}
