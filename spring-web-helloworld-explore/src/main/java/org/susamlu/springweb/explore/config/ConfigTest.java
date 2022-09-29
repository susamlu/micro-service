package org.susamlu.springweb.explore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sam Lu
 * @date 2022/09/28
 */
@Configuration
public class ConfigTest {

    @Bean
    Object getObject() {
        return new Object();
    }

}
