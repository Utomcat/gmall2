package com.ranyk.wms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ranyk
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallWareApplication.class, args);
    }

}
