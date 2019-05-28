package com.enjoy.BeanLifeCycle;

import com.enjoy.cap7.Bean.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:38
 * @Description:
 */

/**
 * 功能描述: bean的生命周期 创建-> 初始化 —>  销毁
 */
@Configuration
@ComponentScan("com.enjoy.BeanLifeCycle")
public class ConfigOfBeanLifeCycle {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Student student() {
        return new Student();
    }
}
