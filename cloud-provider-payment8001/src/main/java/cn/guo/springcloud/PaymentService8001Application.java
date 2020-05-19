package cn.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName PaymentServiceApplication
 * @Description
 * @Author Guo
 * @Date 2020/5/15 10:22
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentService8001Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentService8001Application.class,args);
    }

}
