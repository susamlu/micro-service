package org.susamlu.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.bean.MyBean;
import org.susamlu.springweb.config.BeanConfig;

/**
 * @author Sam Lu
 * @date 2022/12/21
 */
@Component
public class GetBeanTest {

    @Autowired
    private BeanConfig beanConfig;

    @EventListener
    private void getBeans(ApplicationReadyEvent event) {
        MyBean singletonBean1 = beanConfig.singletonBean();
        MyBean singletonBean2 = beanConfig.singletonBean();
        MyBean prototypeBean1 = beanConfig.prototypeBean();
        MyBean prototypeBean2 = beanConfig.prototypeBean();
        System.out.println("singletonBean1 equals singletonBean2: " + singletonBean1.equals(singletonBean2));
        System.out.println("prototypeBean1 equals prototypeBean2: " + prototypeBean1.equals(prototypeBean2));
    }

}
