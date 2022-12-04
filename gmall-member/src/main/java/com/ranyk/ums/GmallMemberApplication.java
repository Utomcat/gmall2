package com.ranyk.ums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ranyk
 */
@EnableFeignClients(basePackages = {"com.ranyk.ums.member.feign"})
@SpringBootApplication
@EnableDiscoveryClient
public class GmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallMemberApplication.class, args);
    }

}
