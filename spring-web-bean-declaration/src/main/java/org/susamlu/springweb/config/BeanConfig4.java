package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyRestTemplate;

/**
 * @author Sam Lu
 * @date 2022/11/19
 */
@Configuration
public class BeanConfig4 {

    @Bean(name = {"restTemplateA", "restTemplateB"})
    public MyRestTemplate myRestTemplate() {
        return new MyRestTemplate();
    }

}
