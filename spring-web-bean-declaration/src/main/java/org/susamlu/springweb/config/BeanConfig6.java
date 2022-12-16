package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyRestTemplate;

/**
 * @author Sam Lu
 * @date 2022/11/19
 */
@Configuration
public class BeanConfig6 {

    @Bean("restTemplateD1")
    public MyRestTemplate myRestTemplate() {
        return new MyRestTemplate();
    }

}
