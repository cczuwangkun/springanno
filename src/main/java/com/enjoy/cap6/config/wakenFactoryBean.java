package com.enjoy.cap6.config;

import com.enjoy.cap6.bean.Monkey;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 19:06
 * @Description:
 */
public class wakenFactoryBean implements FactoryBean<Monkey> {
    @Override
    public Monkey getObject() throws Exception {
        System.out.println("看看我有被实例化吗？？");
        return new Monkey();
    }

    @Override
    public Class<?> getObjectType() {
        return Monkey.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
