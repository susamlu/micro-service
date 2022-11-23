package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyRestTemplate;
import org.susamlu.springweb.component.MyRestTemplate2;

/**
 * @author Sam Lu
 * @date 2022/11/22
 */
@Configuration
public class BeanConfig9 {

    @Bean
    public MyRestTemplate2 myRestTemplate2() {
        return new MyRestTemplate2();
    }

}
