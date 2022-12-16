package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.component.MyRestTemplate;

/**
 * @author Sam Lu
 * @date 2022/08/30
 */
@Configuration
public class BeanConfig {

    @Bean
    public MyRestTemplate myRestTemplate() {
        return new MyRestTemplate();
    }

    @Primary
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
