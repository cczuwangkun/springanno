package com.enjoy.BeanLifeCycle;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:waken
 * @Date: Created in 2019/5/27 20:56
 * @Description:
 */
@Component
public class Student implements BeanNameAware {
    @Value("waken")
    private String name;

    public Student() {
        super();
    }

    public void setName(String name) {
        System.out.println("设置对象的属性");
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁");
    }

    public void play() {
        System.out.println("bean 的使用");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }


    public void setBeanName(String s) {
        System.out.println("调用BeanAware的 setBeanname");

    }
}
