package com.enjoy.cap7.Bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Author:waken
 * @Date: Created in 2019/5/3 16:21
 * @Description:
 */
@Component
public class Train implements InitializingBean, DisposableBean {

    public Train() {
        System.out.println("Train---构造方法-----被执行了-------");
    }

    //当我们的bean销毁时，调用此方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train-----afterPropertiesSet-----");
    }

    //当我们的bean属性赋值和初始化完成时调用
    @Override
    public void destroy() throws Exception {
        System.out.println("train--------------销毁");
    }
}
