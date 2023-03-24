package org.susamlu.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.susamlu.springweb.bean.ChildBean;
import org.susamlu.springweb.bean.RootBean;

/**
 * @author lxc
 * @date 2023/03/21
 */
@Component
public class GenericBeanDefinitionExample2 {

    @Autowired
    private GenericWebApplicationContext context;

    @EventListener
    private void getBeans(ApplicationReadyEvent event) {
        GenericBeanDefinition childBeanDefinition = new GenericBeanDefinition();
        childBeanDefinition.setBeanClass(ChildBean.class);
        context.registerBeanDefinition("childBean", childBeanDefinition);

        GenericBeanDefinition rootBeanDefinition = new GenericBeanDefinition();
        rootBeanDefinition.setBeanClass(RootBean.class);
        rootBeanDefinition.getPropertyValues()
                .addPropertyValue("field", "sample-value");
        context.registerBeanDefinition("rootBean", rootBeanDefinition);

        System.out.println("before getBean");
        RootBean rootBean = event.getApplicationContext().getBean(RootBean.class);
        System.out.println("after getBean");
        rootBean.doSomething();
    }

}
