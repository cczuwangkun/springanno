package com.enjoy.cap7.Bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:waken
 * @Date: Created in 2019/5/3 16:47
 * @Description:
 */
@Component
public class Plane implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public Plane() {
        System.out.println("Plane------constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Plane--------PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Plane--------PreDestroy  ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
