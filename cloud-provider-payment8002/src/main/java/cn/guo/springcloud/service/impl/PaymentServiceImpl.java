package cn.guo.springcloud.service.impl;

import cn.guo.springcloud.dao.PaymentDao;
import cn.guo.springcloud.entities.Payment;
import cn.guo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description
 * @Author Guo
 * @Date 2020/5/15 16:11
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
