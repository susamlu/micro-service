package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Sam Lu
 * @date 2022/12/05
 */
@Component
public class InjectionComponent5 {

    private MyBean myBean;

    @Autowired
    private void myBean(MyBean myBean) {
        this.myBean = myBean;
    }

}
