package com.lt.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class BootdemoApplication {

    @Value("${name}")
    private String name;
    @Value("${want}")
    private String want;
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/")
    public String index(){
        configBean.setName("lut");
        return name + " " + want + " " + configBean.getName();
    }

    public static void main(String[] args) {
        SpringApplication.run(BootdemoApplication.class, args);
    }
}
