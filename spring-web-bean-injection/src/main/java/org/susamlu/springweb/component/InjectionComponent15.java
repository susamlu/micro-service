package org.susamlu.springweb.component;

import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.MyBean;

import javax.inject.Inject;

/**
 * @author Sam Lu
 * @date 2022/12/20
 */
@Component
public class InjectionComponent15 {

    @Inject
    private MyBean myBean1;

    private MyBean myBean2;

    @Inject
    public void setMyBean(MyBean myBean) {
        this.myBean2 = myBean;
    }

    private MyBean myBean3;

    @Inject
    public InjectionComponent15(MyBean myBean) {
        this.myBean3 = myBean;
    }

}
