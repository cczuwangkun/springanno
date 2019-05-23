package com.enjoy;

import lombok.Data;

/**
 * @Author:waken
 * @Date: Created in 2019/4/25 20:52
 * @Description:
 */
@Data
public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
