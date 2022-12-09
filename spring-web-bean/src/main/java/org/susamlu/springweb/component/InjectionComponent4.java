package org.susamlu.springweb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam Lu
 * @date 2022/12/09
 */
@Component
public class InjectionComponent4 {

    private MyBean myBean;
    private RestTemplate restTemplate;
    private Cache cache;

    @Autowired(required = false)
    public InjectionComponent4(MyBean myBean) {
        this.myBean = myBean;
    }

    @Autowired(required = false)
    public InjectionComponent4(MyBean myBean, RestTemplate restTemplate) {
        this.myBean = myBean;
        this.restTemplate = restTemplate;
    }

    @Autowired(required = false)
    public InjectionComponent4(MyBean myBean, RestTemplate restTemplate, Cache cache) {
        this.myBean = myBean;
        this.restTemplate = restTemplate;
        this.cache = cache;
    }

}
