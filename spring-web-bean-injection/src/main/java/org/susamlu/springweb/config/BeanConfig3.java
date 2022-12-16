package org.susamlu.springweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.QualifierBean;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Configuration
public class BeanConfig3 {

    @Bean
    public QualifierBean qualifierBean1() {
        return new QualifierBean("qualifierBean1");
    }

    @Bean
    public QualifierBean qualifierBean2() {
        return new QualifierBean("qualifierBean2");
    }

}
