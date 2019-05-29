package com.enjoy.cap10.Config;

import com.enjoy.cap10.AOP.Calculator;
import com.enjoy.cap10.AOP.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author:waken
 * @Date: Created in 2019/5/28 20:26
 * @Description: AOP
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
