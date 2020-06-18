package com.xyzsoft;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    //这里注入的restTemplate就是在com.sam.ConsumerApp中通过@Bean配置的实例
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello-consumer")
    public String helloConsumer() {
        //调用 eureka-client 服务，注意这里用的是服务名，而不是具体的ip+port
        /*
        使用 MXN2233344 的话报下面的错
        java.lang.IllegalStateException: No instances available for MXN2233344
         */
//        restTemplate.getForObject("http://MXN2233344/hello", String.class);
        restTemplate.getForObject("http://yuk-test-02/hello", String.class);
        return "hello consumer finish !!!";
    }
}
