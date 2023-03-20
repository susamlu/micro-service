package org.susamlu.springweb;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.susamlu.springweb.bean.ChildBean;
import org.susamlu.springweb.bean.RootBean;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
public class GenericBeanDefinitionExample1 {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        GenericBeanDefinition childBeanDefinition = new GenericBeanDefinition();
        childBeanDefinition.setBeanClass(ChildBean.class);
        beanFactory.registerBeanDefinition("childBean", childBeanDefinition);

        GenericBeanDefinition rootBeanDefinition = new GenericBeanDefinition();
        rootBeanDefinition.setBeanClass(RootBean.class);
        rootBeanDefinition.getPropertyValues()
                .addPropertyValue("field", "sample-value");
        rootBeanDefinition.getPropertyValues()
                .addPropertyValue("childBean", childBeanDefinition);
        beanFactory.registerBeanDefinition("rootBean", rootBeanDefinition);

        RootBean rootBean = beanFactory.getBean(RootBean.class);
        rootBean.doSomething();
    }

}
