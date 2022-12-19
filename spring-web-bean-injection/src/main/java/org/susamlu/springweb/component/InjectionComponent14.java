package org.susamlu.springweb.component;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Sam Lu
 * @date 2022/12/14
 */
@Component
public class InjectionComponent14 {

    @Resource(name = "resourceBean1")
    private ResourceBean myBean1;

    private ResourceBean myBean2;

    @Resource(name = "resourceBean2")
    public void setMyBean2(ResourceBean resourceBean) {
        this.myBean2 = resourceBean;
    }

}
