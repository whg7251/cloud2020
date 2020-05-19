package cn.guo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentController
 * @Description
 * @Author Guo
 * @Date 2020/5/19 15:57
 * @Version 1.0
 **/
@Slf4j
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul(){

        return "SpringCloud with Consul:" +serverPort+"\t"+ UUID.randomUUID().toString();

    }

}
