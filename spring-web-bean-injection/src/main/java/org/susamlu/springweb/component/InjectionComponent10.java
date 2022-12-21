package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.PrimaryBean;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Component
public class InjectionComponent10 {

    @Autowired
    private PrimaryBean primaryBean;

}
