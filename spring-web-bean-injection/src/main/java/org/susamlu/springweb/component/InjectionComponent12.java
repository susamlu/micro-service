package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.QualifierBean;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Component
public class InjectionComponent12 {

    @Qualifier
    @Autowired
    private QualifierBean qualifierBean;

}
