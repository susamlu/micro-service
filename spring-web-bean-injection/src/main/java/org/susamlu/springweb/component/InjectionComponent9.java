package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.BaseOrderBean;

import java.util.Map;

/**
 * @author Sam Lu
 * @date 2022/12/12
 */
@Component
public class InjectionComponent9 {

    @Autowired
    private Map<String, BaseOrderBean> orderBeanMap;

}
