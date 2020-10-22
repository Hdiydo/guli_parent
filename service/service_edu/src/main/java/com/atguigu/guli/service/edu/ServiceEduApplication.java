package com.atguigu.guli.service.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.atguigu.guli"})
public class ServiceEduApplication {
    //每一个微服务 都只扫描当前 类所在目录下的
    //为了能 扫描到 com.atguigu.guli.service.base.config 包 下的配置文件
    //@ComponentScan({"com.atguigu.guli"})  这就是它的作用
    //需要service 模块中引入   service_edu 模块  才可以扫描到
    public static void main(String[] args) {
        SpringApplication.run(ServiceEduApplication.class, args);
    }
}
