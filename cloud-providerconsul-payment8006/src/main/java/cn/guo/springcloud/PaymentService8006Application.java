package cn.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PaymentService8006Application
 * @Description
 * @Author Guo
 * @Date 2020/5/19 15:51
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentService8006Application {
    public static void main(String[] args) {
        SpringApplication.run(PaymentService8006Application.class, args);
    }
}
