package com.mxn.eurekaclient;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        //打印服务的服务id
        return "hello,this is hello-service";
    }

}
