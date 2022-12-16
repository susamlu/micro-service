package org.susamlu.springweb.component;

import java.util.Date;

/**
 * @author Sam Lu
 * @date 2022/11/30
 */
public class MyBean2 {

    private String field;

    public void setField(String field) {
        this.field = field;
    }

    public void doSomething() {
        System.out.println("from my bean, field: " + field);
    }

}
