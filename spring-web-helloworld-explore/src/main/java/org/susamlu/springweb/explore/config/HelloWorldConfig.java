package org.susamlu.springweb.explore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam Lu
 * @date 2022/09/28
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
