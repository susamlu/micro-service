package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.OrderBean3;

import java.util.List;

/**
 * @author Sam Lu
 * @date 2022/12/12
 */
@Component
public class InjectionComponent8 {

    @Autowired
    private List<OrderBean3> orderBeans;

}
