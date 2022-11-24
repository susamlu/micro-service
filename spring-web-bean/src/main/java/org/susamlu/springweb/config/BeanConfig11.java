package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.*;

/**
 * @author Sam Lu
 * @date 2022/11/23
 */
@Configuration
public class BeanConfig11 {

    @Bean
    public MyRestTemplate4 myRestTemplate4() {
        return new MyRestTemplate4();
    }

    @Bean
    public MyRestTemplate5 myRestTemplate5() {
        return new MyRestTemplate5();
    }

    @Bean(destroyMethod = "destroy")
    public MyRestTemplate6 myRestTemplate6() {
        return new MyRestTemplate6();
    }

    @Bean(destroyMethod = "")
    public MyRestTemplate7 myRestTemplate7() {
        return new MyRestTemplate7();
    }

}
