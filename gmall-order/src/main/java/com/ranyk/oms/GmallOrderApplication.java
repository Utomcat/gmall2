package com.ranyk.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ranyk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallOrderApplication.class, args);
    }

}
