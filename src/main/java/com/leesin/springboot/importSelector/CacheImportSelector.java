package com.leesin.springboot.importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 10:23
 * @version: ${VERSION}
 * @modified By:
 */
public class CacheImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        //获得EnableDefineService的内容
        Map<String, Object> annotationAttributes =
                annotationMetadata.getAnnotationAttributes(EnableDefineService.class.getName());

        //然后就能获得一些execlude等class，动态的去加载bean

        // 根据这里的execlude判断下面要不要加载bean

        //返回的是将要加载的类
        //返回的是一个固定的cacheService
        return new String[]{A.class.getName()};
    }
}
