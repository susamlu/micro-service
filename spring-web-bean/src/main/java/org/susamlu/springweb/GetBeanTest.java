package org.susamlu.springweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.config.BeanConfig;
import org.susamlu.springweb.config.BeanConfig3;

/**
 * @author Sam Lu
 * @date 2022/11/22
 */
@Component
public class GetBeanTest {

    @Autowired
    private BeanConfig beanConfig;
    @Autowired
    private BeanConfig3 beanConfig3;

    @EventListener
    private void testGetBean(ApplicationReadyEvent event) {
        RestTemplate restTemplate1 = beanConfig.restTemplate();
        RestTemplate restTemplate2 = beanConfig.restTemplate();
        RestTemplate restTemplate3 = beanConfig3.restTemplate2();
        RestTemplate restTemplate4 = beanConfig3.restTemplate2();
        System.out.println("restTemplate1 equals restTemplate2: " + restTemplate1.equals(restTemplate2));
        System.out.println("restTemplate3 equals restTemplate4: " + restTemplate3.equals(restTemplate4));
    }

}
