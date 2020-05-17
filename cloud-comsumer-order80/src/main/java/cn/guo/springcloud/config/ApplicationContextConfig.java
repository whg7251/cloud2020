package cn.guo.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description Spring容器注册类
 * @Author Guo
 * @Date 2020/5/16 19:41
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    /**
     * RestTemplate 是Spring提供的便捷访问远程端口得配置类，简单易用，传入三个参数就可以了(url,params,ResponseBean.class)
     * ResponseBean.class 是HTTP相应转换被转换成得对象类型
     * @return RestTemplate 对象注册
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//applicationContext.xml <bean id='' class=''/>
