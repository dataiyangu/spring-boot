package com.leesin.springboot.importSelector;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 10:26
 * @version: ${VERSION}
 * @modified By:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CacheImportSelector.class,LoggerDefinitionRegistar.class})

public @interface EnableDefineService {
}
