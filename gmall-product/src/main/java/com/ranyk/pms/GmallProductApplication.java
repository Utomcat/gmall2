package com.ranyk.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ranyk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallProductApplication.class, args);
    }

}
