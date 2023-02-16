package org.susamlu.springweb.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
import org.susamlu.springweb.bean.MyBean;

/**
 * @author Sam Lu
 * @date 2022/12/21
 */
@Configuration
public class ScopeBeanConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MyBean singletonBean() {
        return new MyBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MyBean prototypeBean() {
        return new MyBean();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public MyBean requestBean() {
        return new MyBean();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public MyBean sessionBean() {
        return new MyBean();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_APPLICATION, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public MyBean applicationBean() {
        return new MyBean();
    }

    @Bean
    @RequestScope
    public MyBean requestBean2() {
        return new MyBean();
    }

    @Bean
    @SessionScope
    public MyBean sessionBean2() {
        return new MyBean();
    }

    @Bean
    @ApplicationScope
    public MyBean applicationBean2() {
        return new MyBean();
    }

}
