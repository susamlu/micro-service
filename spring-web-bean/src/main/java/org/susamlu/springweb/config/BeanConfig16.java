package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.susamlu.springweb.component.OrderBean3;

/**
 * @author Sam Lu
 * @date 2022/12/12
 */
@Configuration
public class BeanConfig16 {

    @Bean
    @Order(1)
    public OrderBean3 orderBean3() {
        OrderBean3 orderBean = new OrderBean3();
        orderBean.setField("order 1");
        return orderBean;
    }

    @Bean
    @Order(2)
    public OrderBean3 orderBean4() {
        OrderBean3 orderBean = new OrderBean3();
        orderBean.setField("order 2");
        return orderBean;
    }

}
