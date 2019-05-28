package com.enjoy.cap7.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author:waken
 * @Date: Created in 2019/5/3 17:06
 * @Description:
 */
@Component
public class wakenBeanPostProcessor implements BeanPostProcessor {


    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization----"+beanName+"-----"+bean);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization----"+beanName+"-----"+bean);
        return bean;
    }
}


