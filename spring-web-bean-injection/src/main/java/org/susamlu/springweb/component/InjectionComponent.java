package org.susamlu.springweb.component;

import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.MyBean;

/**
 * @author Sam Lu
 * @date 2022/12/05
 */
@Component
public class InjectionComponent {

    private MyBean myBean;

    public InjectionComponent(MyBean myBean) {
        this.myBean = myBean;
    }

}
