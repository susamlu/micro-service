package org.susamlu.springweb.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.bean.QualifierBean;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Configuration
public class BeanConfig4 {

    @Qualifier
    @Bean
    public QualifierBean qualifierBean3() {
        return new QualifierBean("qualifierBean3");
    }

    @Bean
    public QualifierBean qualifierBean4() {
        return new QualifierBean("qualifierBean4");
    }

}
