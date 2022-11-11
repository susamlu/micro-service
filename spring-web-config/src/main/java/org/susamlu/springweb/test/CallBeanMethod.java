package org.susamlu.springweb.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.config.FirstConfig;

import java.util.Arrays;

/**
 * @author Sam Lu
 * @date 2022/11/04
 */
@Slf4j
@Component
public class CallBeanMethod {

    @Autowired
    private FirstConfig firstConfig;

    @EventListener
    public void onStartup(ApplicationReadyEvent event) {
        RestTemplate restTemplate1 = firstConfig.getRestTemplate();
        RestTemplate restTemplate2 = firstConfig.getRestTemplate();
        log.info("Equals: {}", restTemplate1.equals(restTemplate2));
    }

}
