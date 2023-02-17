package org.susamlu.springweb.bean;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author lxc
 * @date 2023/02/17
 */
@Component
@DependsOn({"myDependsOnBeanB"})
public class MyDependsOnBeanA {

    public MyDependsOnBeanA() {
        System.out.println("init MyDependsOnBeanA");
    }

}
