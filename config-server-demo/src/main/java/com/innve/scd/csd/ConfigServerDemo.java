package com.innve.scd.csd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by wlc on 2017/4/9.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerDemo {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerDemo.class, args);
    }
}
