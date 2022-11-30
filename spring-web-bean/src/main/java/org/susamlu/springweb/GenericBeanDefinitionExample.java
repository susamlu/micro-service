package org.susamlu.springweb;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.susamlu.springweb.component.MyBean2;

import java.util.Date;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
public class GenericBeanDefinitionExample {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        beanDefinition.setBeanClass(MyBean2.class);
        beanDefinition.getPropertyValues().addPropertyValue("field", "sample-value");
        beanFactory.registerBeanDefinition("myBean", beanDefinition);

        MyBean2 bean = beanFactory.getBean(MyBean2.class);
        bean.doSomething();
    }

}
