package cn.guo.springcloud.controller;

import cn.guo.springcloud.entities.CommonResult;
import cn.guo.springcloud.entities.Payment;
import cn.guo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Description
 * @Author Guo
 * @Date 2020/5/15 16:15
 * @Version 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "payment/create" )
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("***** 插入结果： "+result);

        if (result>0){
            return new CommonResult<>(200,"插入数据库成功,serverPort:  "+serverPort,result);
        }else {
            return new CommonResult<Integer>(444,"插入数据库失败,serverPort:  "+serverPort,null);
        }
    }

    @GetMapping(value = "payment/getPaymentById/{id}" )
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){


        Payment payment = paymentService.getPaymentById(id);
        log.info("***** 查询结果："+payment);

        if (payment!=null){
            return new CommonResult<>(200,"查询成功,serverPort:  "+serverPort,payment);
        }else {
            return new CommonResult<>(444,"无对应记录"+id+",serverPort:  "+serverPort,null);
        }
    }



}
