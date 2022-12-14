package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.susamlu.springweb.component.MyBean3;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Configuration
public class BeanConfig17 {

    @Primary
    @Bean
    public MyBean3 primaryTestBean1() {
        return new MyBean3("primaryTestBean1");
    }

    @Bean
    public MyBean3 primaryTestBean2() {
        return new MyBean3("primaryTestBean2");
    }

}
