package com.enjoy.cap6.config;

import com.enjoy.Person;
import com.enjoy.cap6.bean.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

/**
 * @Author:waken
 * @Date: Created in 2019/4/25 20:50
 * @Description:
 */
@Configuration
@Import(value = {Dog.class, wakenImportSelector.class, wakenImportBeanDefinitionRegistrar.class})
public class Cap6MainConfig {
    /**
     * 给容器注册组件的方法
     * 0.通过xml文件定义
     * 1.@Bean 导入第三方累或包组件  比如项目redis序列号配置，线程池配置等等
     * 2.@componentScan 包扫描+组件的注解  @Controller @Service @Reponsitory @Component
     * 一般是我们自己写的类
     * <p>
     * 3.@Import [快速给容器导入一个组件]
     * a.@Import (要导入到容器中的组件)：容器会自动注册这个组件，bean的Id为全类名
     * b.@ImportSelector:是一个接口，返回需要导入到容器中的组件的全类名。
     * c.@ImportBeanDefinitionRegistrar:可以手动添加组件到容器中，
     * 所有bean的注册都可以使用BeanDefinitionRegistrar
     *
     * 4.通过FactoryBean接口
     *     a.context.getBean("factoryBean");  获取的是getObject创建的实例。
     *     b.context.getBean("&factoryBean"); 获取factoryBean实例。
     */

    @Bean("person")
    public Person person() {
        System.out.println("给容器创建person");
        return new Person("waken", 20);
    }

    @Bean("factoryBean")
    public wakenFactoryBean wakenFactoryBean() {
        return new wakenFactoryBean();
    }


}
