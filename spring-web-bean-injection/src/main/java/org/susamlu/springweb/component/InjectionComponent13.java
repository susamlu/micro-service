package org.susamlu.springweb.component;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Component
public class InjectionComponent13 {

    @Resource
    private ResourceBean resourceBean1;

    private ResourceBean resourceBean2;

    @Resource
    public void setResourceBean2(ResourceBean resourceBean) {
        this.resourceBean2 = resourceBean;
    }

}
