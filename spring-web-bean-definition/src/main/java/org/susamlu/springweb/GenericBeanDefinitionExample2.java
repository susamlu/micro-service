package org.susamlu.springweb;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.susamlu.springweb.bean.ChildBean;
import org.susamlu.springweb.bean.RootBean;

/**
 * @author lxc
 * @date 2023/03/21
 */
@Configuration
public class GenericBeanDefinitionExample2 implements ApplicationContextAware {

    @Autowired
    private GenericWebApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        GenericBeanDefinition childBeanDefinition = new GenericBeanDefinition();
        childBeanDefinition.setBeanClass(ChildBean.class);
        context.registerBeanDefinition("childBean", childBeanDefinition);

        GenericBeanDefinition rootBeanDefinition = new GenericBeanDefinition();
        rootBeanDefinition.setBeanClass(RootBean.class);
        rootBeanDefinition.getPropertyValues()
                .addPropertyValue("field", "sample-value");
        context.registerBeanDefinition("rootBean", rootBeanDefinition);

        AutowireCapableBeanFactory beanFactory = context.getAutowireCapableBeanFactory();
        RootBean rootBean = beanFactory.getBean(RootBean.class);
        rootBean.doSomething();
    }

}
