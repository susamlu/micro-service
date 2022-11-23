package org.susamlu.springweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.client.RestTemplate;
import org.susamlu.springweb.config.BeanConfig;
import org.susamlu.springweb.config.BeanConfig3;

import java.util.Arrays;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@Slf4j
@SpringBootApplication
public class BeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanApplication.class, args);
    }

    @EventListener
    public void printBeanNames(ApplicationReadyEvent event) {
        Arrays.stream(event.getApplicationContext().getBeanDefinitionNames())
                .sorted()
                .forEach(name -> {
                    Object obj = event.getApplicationContext().getBean(name);
                    log.info("name: {}, class {}, instance: {}", name, obj.getClass(), obj);
                });

        String name = "restTemplateB";
        Object obj = event.getApplicationContext().getBean(name);
        log.info("name: {}, class {}, instance: {}", name, obj.getClass(), obj);
    }

}