package com.enjoy.cap5.config;

import com.enjoy.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:waken
 * @Date: Created in 2019/4/25 20:50
 * @Description:  根据条件进行Bean的初始化
 */
@Configuration
public class Cap5MainConfig {

    @Conditional(WinCondition.class)
    @Bean("person")
    public Person person() {
        System.out.println("给容器创建person");
        return new Person("waken", 20);
    }

    @Conditional(LinuxCondition.class)
    @Bean("lison")
    public Person lison() {
        System.out.println("给容器创建lison");
        return new Person("lison", 20);
    }

    @Bean("James")
    public Person James() {
        System.out.println("给容器创建James");
        return new Person("James", 20);
    }

}
