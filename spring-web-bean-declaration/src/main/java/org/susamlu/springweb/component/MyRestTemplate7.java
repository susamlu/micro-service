package org.susamlu.springweb.component;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author Sam Lu
 * @date 2022/11/18
 */
public class MyRestTemplate7 implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("call MyRestTemplate7#destroy()");
    }

}
