package com.enjoy.cap8.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @Author:waken
 * @Date: Created in 2019/5/4 13:21
 * @Description:
 */
@Data
public class Bird {
    @Value("${bird.name}")
    private String name;

    @Value("${bird.age}")
    private Integer age;

    public Bird() {
        super();
    }

    public Bird(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }
}
