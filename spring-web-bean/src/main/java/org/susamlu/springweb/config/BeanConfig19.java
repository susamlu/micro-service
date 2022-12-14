package org.susamlu.springweb.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyBean3;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Configuration
public class BeanConfig19 {

    @Qualifier
    @Bean
    public MyBean3 qualifierTestBean3() {
        return new MyBean3("qualifierTestBean3");
    }

    @Bean
    public MyBean3 qualifierTestBean4() {
        return new MyBean3("qualifierTestBean4");
    }

}
