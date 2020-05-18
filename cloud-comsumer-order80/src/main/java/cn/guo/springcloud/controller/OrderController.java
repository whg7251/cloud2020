package cn.guo.springcloud.controller;

import cn.guo.springcloud.entities.CommonResult;
import cn.guo.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description
 * @Author Guo
 * @Date 2020/5/16 19:37
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderController {


    // private final static String PAYMENT_URL = "http://localhost:8001";
    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        log.info("12");
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/"+id,CommonResult.class);
    }


}
