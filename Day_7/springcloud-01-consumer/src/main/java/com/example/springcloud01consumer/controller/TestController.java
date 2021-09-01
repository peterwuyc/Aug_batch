package com.example.springcloud01consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/demo")
    public String getProvider(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://01-EUREKA-PROVIDER/demo",String.class);
        String body = responseEntity.getBody();
        return "Eureka中的消费者-------------" + body;

    }

    /**
     * 超时熔断
     */
    @HystrixCommand(fallbackMethod = "overtime",
                                    commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
    @GetMapping("/demo/test01")
    public String test01(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://01-EUREKA-PROVIDER/test01",String.class);
        String body = responseEntity.getBody();
        return "Eureka中的消费者-------------" + body;

    }

    /**
     *
     *异常熔断
     */
    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/demo/test02")
    public String test02(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://01-EUREKA-PROVIDER/test02",String.class);
        String body = responseEntity.getBody();
        return "Eureka中的消费者-------------" + body;

    }

    private String error(){
        return "因为服务器异常所以熔断辣！！！";
    }

    private String overtime(){
        return "因为服务器超时所以熔断辣！！！";
    }
}

