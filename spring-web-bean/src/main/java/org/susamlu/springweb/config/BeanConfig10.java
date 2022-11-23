package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyRestTemplate3;

/**
 * @author Sam Lu
 * @date 2022/11/23
 */
@Configuration
public class BeanConfig10 {

    @Bean(initMethod = "init")
    public MyRestTemplate3 myRestTemplate3() {
        return new MyRestTemplate3();
    }

}
