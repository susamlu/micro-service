package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.ResourceBean;

/**
 * @author Sam Lu
 * @date 2022/12/15
 */
@Configuration
public class BeanConfig20 {

    @Bean
    public ResourceBean resourceBean1() {
        return new ResourceBean("resourceBean1");
    }

    @Bean
    public ResourceBean resourceBean2() {
        return new ResourceBean("resourceBean2");
    }

}
