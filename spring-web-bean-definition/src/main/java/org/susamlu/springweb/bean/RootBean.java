package org.susamlu.springweb.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lxc
 * @date 2023/03/17
 */
@Component
public class RootBean implements SuperBean {

    @Autowired
    private ChildBean childBean;

    private String field;

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public void doSomething() {
        System.out.println("from root bean, field: " + field);
    }

    public void init(ChildBean childBean) {
        this.childBean = childBean;
    }

    public void init(ChildBean childBean, String field) {
        this.childBean = childBean;
        this.field = field;
    }

}
