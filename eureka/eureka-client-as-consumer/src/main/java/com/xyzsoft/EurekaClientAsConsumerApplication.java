package com.xyzsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientAsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAsConsumerApplication.class, args);
    }

    //@Bean 应用在方法上，用来将方法返回值设为为bean
    @Bean
    @LoadBalanced  //@LoadBalanced实现负载均衡, 没有加这个注解的时候, http://localhost:9999/hello-consumer 会说unknown host exception
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
