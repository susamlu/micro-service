package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam Lu
 * @date 2022/11/20
 */
@Component
public class BeanConfig3 {

    @Bean
    public RestTemplate restTemplate2() {
        return new RestTemplate();
    }

}
