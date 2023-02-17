package org.susamlu.springweb.bean;

import org.springframework.stereotype.Component;

/**
 * @author lxc
 * @date 2023/02/17
 */
@Component
public class MyDependsOnBeanB {

    public MyDependsOnBeanB() {
        System.out.println("init MyDependsOnBeanB");
    }

}
