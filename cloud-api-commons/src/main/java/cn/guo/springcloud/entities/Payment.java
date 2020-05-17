package cn.guo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Payment
 * @Description 支付实体类
 * @Author Guo
 * @Date 2020/5/15 14:59
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private long id;

    private String serial;

}
