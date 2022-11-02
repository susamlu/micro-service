package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author Sam Lu
 * @date 2022/11/02
 */
@Component
public class ComponentAnnotationConfig {

    @Bean
    HashMap getHashMap() {
        return new HashMap();
    }

}
