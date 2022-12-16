package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.susamlu.springweb.component.PrimaryBean;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Configuration
public class BeanConfig2 {

    @Primary
    @Bean
    public PrimaryBean primaryBean1() {
        return new PrimaryBean("primaryBean1");
    }

    @Bean
    public PrimaryBean primaryBean2() {
        return new PrimaryBean("primaryBean2");
    }

}
