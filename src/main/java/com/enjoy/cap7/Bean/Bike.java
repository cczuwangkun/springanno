package com.enjoy.cap7.Bean;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author:waken
 * @Date: Created in 2019/4/27 21:43
 * @Description:
 */
@Data
public class Bike  {
    public Bike() {
        System.out.println("bike constructor------------");
    }

    public void init(){
        System.out.println("bike init --------------");
    }

    public void destroy(){
        System.out.println("bike destroy---------------");
    }

}
