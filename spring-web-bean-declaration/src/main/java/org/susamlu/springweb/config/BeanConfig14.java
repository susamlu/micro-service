package org.susamlu.springweb.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.susamlu.springweb.component.MyBean2;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
@Configuration
public class BeanConfig14 implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBean2.class)
                .addPropertyValue("field", "sample-value");
        ((DefaultListableBeanFactory) beanFactory)
                .registerBeanDefinition("myBean2", builder.getBeanDefinition());
    }

}
