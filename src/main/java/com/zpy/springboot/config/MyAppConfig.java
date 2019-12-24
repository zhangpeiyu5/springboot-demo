package com.zpy.springboot.config;

import com.zpy.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 用注解的方式代替spring配置文件
 */
@Configuration
public class MyAppConfig {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名。
     * @return
     */
    @Bean
    public HelloService helloService2() {
        System.out.println("@Bean给容器中添加组件");
        return new HelloService();
    }
}
