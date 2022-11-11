package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam Lu
 * @date 2022/11/04
 */
@Configuration(proxyBeanMethods = false)
public class FirstConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
