package org.susamlu.springweb.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author lxc
 * @date 2023/02/16
 */
@Component
@Lazy
public class MyLazyBean {

    public MyLazyBean() {
        System.out.println("init MyLazyBean");
    }

}
