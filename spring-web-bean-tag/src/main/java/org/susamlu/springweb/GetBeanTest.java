package org.susamlu.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.MyBean;
import org.susamlu.springweb.config.ScopeBeanConfig;

/**
 * @author Sam Lu
 * @date 2022/12/21
 */
@Component
public class GetBeanTest {

    @Autowired
    private ScopeBeanConfig scopeBeanConfig;

    @EventListener
    private void getBeans(ApplicationReadyEvent event) {
        MyBean singletonBean1 = scopeBeanConfig.singletonBean();
        MyBean singletonBean2 = scopeBeanConfig.singletonBean();
        MyBean prototypeBean1 = scopeBeanConfig.prototypeBean();
        MyBean prototypeBean2 = scopeBeanConfig.prototypeBean();
        System.out.println("singletonBean1 与 singletonBean2 是同一个对象: "
                + ((singletonBean1.equals(singletonBean2) ? "是" : "不是")));
        System.out.println("prototypeBean1 与 prototypeBean2 是同一个对象: "
                + (prototypeBean1.equals(prototypeBean2) ? "是" : "不是"));
    }

}
