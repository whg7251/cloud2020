package cn.guo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
public class PaymentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentServiceApplication.class,args);
    }

}
