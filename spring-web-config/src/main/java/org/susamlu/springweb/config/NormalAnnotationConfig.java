package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Sam Lu
 * @date 2022/11/02
 */
@Configuration
public class NormalAnnotationConfig {

    @Bean
    ConcurrentHashMap getConcurrentHashMap() {
        return new ConcurrentHashMap();
    }

}
