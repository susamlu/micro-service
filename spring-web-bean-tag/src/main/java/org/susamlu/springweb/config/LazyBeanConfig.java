package org.susamlu.springweb.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.susamlu.springweb.bean.MyBean;
import org.susamlu.springweb.bean.MyLazyBean;
import org.susamlu.springweb.bean.MyNormalBean;

/**
 * @author lxc
 * @date 2023/02/15
 */
@Configuration
public class LazyBeanConfig {

    @Bean
    @Lazy
    public MyLazyBean lazyBean() {
        return new MyLazyBean();
    }

    @Bean
    public MyNormalBean normalBean() {
        return new MyNormalBean();
    }

}
