package com.jingda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.jingda.controller")
public class ManageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
        System.out.println("lallalallalallalal");
    }

//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        // 注意这里要指向原先用main方法执行的Application启动类
//        return builder.sources(ManageApplication.class);
//    }
}
