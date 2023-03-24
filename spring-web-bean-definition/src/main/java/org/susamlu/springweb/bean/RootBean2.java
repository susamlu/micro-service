package org.susamlu.springweb.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lxc
 * @date 2023/03/17
 */
@Component
public class RootBean2 {

    public RootBean2() {
        System.out.println("init RootBean2");
    }

    private String field;

    public void setField(String field) {
        this.field = field;
    }

    @Autowired
    private ChildBean2 childBean;

    public void setChildBean(ChildBean2 childBean) {
        this.childBean = childBean;
    }

    public void doSomething() {
        System.out.println("from root bean2, field: " + field + ", childBean: " + childBean);
    }

}
