package com.example.springcloud01consumer;

//import com.example.myrule.MyselfRule;
import com.example.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@RibbonClient(name = "01-EUREKA-PROVIDER", configuration = MyselfRule.class)
public class Springcloud01ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud01ConsumerApplication.class, args);
    }

}
