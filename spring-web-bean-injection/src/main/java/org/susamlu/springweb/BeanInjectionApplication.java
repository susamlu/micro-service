package org.susamlu.springweb;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@SpringBootApplication
public class BeanInjectionApplication implements ApplicationContextAware {

    @Autowired
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(BeanInjectionApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BeanInjectionApplication.applicationContext = applicationContext;
    }

}