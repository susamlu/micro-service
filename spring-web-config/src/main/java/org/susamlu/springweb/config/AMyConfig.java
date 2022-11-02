package org.susamlu.springweb.config;

import org.springframework.context.annotation.*;

/**
 * @author Sam Lu
 * @date 2022/08/30
 */
@Configuration
@PropertySource("")
@Import(String.class)
@ImportResource
public class AMyConfig {

    @Bean
    public void a() {

    }

}
