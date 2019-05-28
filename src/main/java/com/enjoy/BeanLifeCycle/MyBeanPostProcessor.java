package com.enjoy.BeanLifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Author:waken
 * @Date: Created in 2019/5/27 21:00
 * @Description:
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    //对初始化之前的Bean进行处理
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对初始化前的 bean 进行处理"+bean);
        return bean;
    }

    //对初始化之后的Bean进行处理
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Student stu = null;
        System.out.println("对初始化之后的Bean进行处理,将Bean的成员变量的值修改了");
        if("name".equals(beanName) || bean instanceof Student) {
            stu = (Student) bean;
            stu.setName("Jack");
        }
        return stu;
    }
}
