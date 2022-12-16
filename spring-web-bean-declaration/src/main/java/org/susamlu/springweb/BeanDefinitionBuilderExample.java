package org.susamlu.springweb;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.susamlu.springweb.component.MyBean2;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
public class BeanDefinitionBuilderExample {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyBean2.class)
                .addPropertyValue("field", "sample-value");
        beanFactory.registerBeanDefinition("myBean", builder.getBeanDefinition());

        MyBean2 bean = beanFactory.getBean(MyBean2.class);
        bean.doSomething();
    }

}
