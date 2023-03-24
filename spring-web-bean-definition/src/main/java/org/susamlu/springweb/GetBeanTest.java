package org.susamlu.springweb;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.RootBean2;

/**
 * @author lxc
 * @date 2023/03/21
 */
@Component
public class GetBeanTest {

    @EventListener
    private void getBeans(ApplicationReadyEvent event) {
        System.out.println("before getBean2");
        RootBean2 rootBean2 = event.getApplicationContext().getBean(RootBean2.class);
        System.out.println("after getBean2");
        rootBean2.doSomething();
    }

}
