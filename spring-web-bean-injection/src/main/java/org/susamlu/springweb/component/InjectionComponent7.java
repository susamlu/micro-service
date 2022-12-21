package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.BaseOrderBean;

import java.util.List;

/**
 * @author Sam Lu
 * @date 2022/12/12
 */
@Component
public class InjectionComponent7 {

    @Autowired
    private List<BaseOrderBean> orderBeans;

}
