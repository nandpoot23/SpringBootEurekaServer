package com.example.spring.boot.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mlahariya
 * @version 1.0, Aug 2017
 */

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication eurekaServer = new SpringApplication(SpringBootEurekaServerApplication.class);
        eurekaServer.addListeners(new ApplicationPidFileWriter("eureka-server.pid"));
        eurekaServer.run(args);

    }
}
