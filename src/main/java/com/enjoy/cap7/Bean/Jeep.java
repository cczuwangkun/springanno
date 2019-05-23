package com.enjoy.cap7.Bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:waken
 * @Date: Created in 2019/5/3 16:47
 * @Description:
 */
@Component
public class Jeep {
    public Jeep() {
        System.out.println("jeep------constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("jeep--------PostConstruct");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jeep--------PreDestroy  ");
    }
}
