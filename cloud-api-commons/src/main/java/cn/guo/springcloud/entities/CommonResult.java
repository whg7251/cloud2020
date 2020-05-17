package cn.guo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName CommonResult
 * @Description 通用返回前端实体类
 * @Author Guo
 * @Date 2020/5/15 15:01
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code,String message) {

        this(code,message,null);

    }

}
