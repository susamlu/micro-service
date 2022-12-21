package org.susamlu.springweb.component;

import org.springframework.stereotype.Component;
import org.susamlu.springweb.bean.ResourceBean;

import javax.inject.Inject;

/**
 * @author Sam Lu
 * @date 2022/12/20
 */
@Component
public class InjectionComponent16 {

    @Inject
    private ResourceBean resourceBean1;

    private ResourceBean resourceBean2;

    @Inject
    public void setResourceBean(ResourceBean resourceBean2) {
        this.resourceBean2 = resourceBean2;
    }

    private ResourceBean resourceBean3;

    @Inject
    public InjectionComponent16(ResourceBean resourceBean2) {
        this.resourceBean3 = resourceBean2;
    }

}
