package org.susamlu.springweb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Sam Lu
 * @date 2022/11/24
 */
@Slf4j
@Component
public class PrintBeanTest {

    @EventListener
    public void printBeans(ApplicationReadyEvent event) {
        Arrays.stream(event.getApplicationContext().getBeanDefinitionNames())
                .sorted()
                .forEach(name -> {
                    Object obj = event.getApplicationContext().getBean(name);
                    log.info("name: {}, class {}, instance: {}", name, obj.getClass(), obj);
                });

        String name = "restTemplateB";
        Object obj = event.getApplicationContext().getBean(name);
        log.info("name: {}, class {}, instance: {}", name, obj.getClass(), obj);

        String name2 = "injectionComponent4";
        Object obj2 = event.getApplicationContext().getBean(name2);
        log.info("name: {}, class {}, instance: {}", name2, obj2.getClass(), obj2);

        String name3 = "injectionComponent5";
        Object obj3 = event.getApplicationContext().getBean(name3);
        log.info("name: {}, class {}, instance: {}", name3, obj3.getClass(), obj3);

        String name4 = "injectionComponent6";
        Object obj4 = event.getApplicationContext().getBean(name4);
        log.info("name: {}, class {}, instance: {}", name4, obj4.getClass(), obj4);
    }

}
