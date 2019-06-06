package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 17:29
 * @Description:
 */

/**
 * AnnotationMetadata:当前类的注解信息
 * BeanDefinitionRegistry：把所有需要添加到容器的bean加入。
 */
public class wakenImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean b1 = registry.containsBeanDefinition("com.enjoy.cap6.bean.Fish");
        boolean b2 = registry.containsBeanDefinition("com.enjoy.cap6.bean.Tigger");

        if (b1 && b2) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", rootBeanDefinition);
        }
    }
}
