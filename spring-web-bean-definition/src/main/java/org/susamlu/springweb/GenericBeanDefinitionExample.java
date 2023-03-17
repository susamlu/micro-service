package org.susamlu.springweb;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.susamlu.springweb.bean.RootBean;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
public class GenericBeanDefinitionExample {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(RootBean.class);
        beanDefinition.getPropertyValues().addPropertyValue("field", "sample-value");
        beanFactory.registerBeanDefinition("rootBean", beanDefinition);

        RootBean rootBean = beanFactory.getBean(RootBean.class);
        rootBean.doSomething();
    }

}
