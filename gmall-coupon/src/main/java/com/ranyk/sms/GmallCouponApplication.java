package com.ranyk.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ranyk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallCouponApplication.class, args);
    }

}
