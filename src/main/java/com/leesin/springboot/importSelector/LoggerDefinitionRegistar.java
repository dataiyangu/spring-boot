package com.leesin.springboot.importSelector;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/4/10 10:43
 * @version: ${VERSION}
 * @modified By:
 */
public class LoggerDefinitionRegistar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        Class<B> bClass = B.class;
        RootBeanDefinition BeanDefinition = new RootBeanDefinition(bClass);

        //首字母小写
        String beanName = StringUtils.uncapitalize(bClass.getSimpleName());
        registry.registerBeanDefinition(beanName, BeanDefinition);
    }
}
