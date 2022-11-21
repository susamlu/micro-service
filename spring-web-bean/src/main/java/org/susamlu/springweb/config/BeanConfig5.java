package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.component.MyRestTemplate;

/**
 * @author Sam Lu
 * @date 2022/11/19
 */
@Configuration
public class BeanConfig5 {

    @Bean("restTemplateC")
    public MyRestTemplate myRestTemplate() {
        return new MyRestTemplate();
    }

    @Bean("restTemplateC")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
