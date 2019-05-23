package com.enjoy.cap8.config;

import com.enjoy.cap7.Bean.Bike;
import com.enjoy.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:38
 * @Description:
 */

/**
 * 功能描述:
 */
@Configuration
@PropertySource(value="classpath:/test.properties")
public class Cap8MainConfig {

    @Bean
    public Bird bird() {
        return new Bird();
    }
}
