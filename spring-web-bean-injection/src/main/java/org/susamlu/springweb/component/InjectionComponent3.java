package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.MyBean;

/**
 * @author Sam Lu
 * @date 2022/12/05
 */
@Component
public class InjectionComponent3 {

    @Autowired
    private MyBean myBean;

}
