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

        String name5 = "injectionComponent7";
        Object obj5 = event.getApplicationContext().getBean(name5);
        log.info("name: {}, class {}, instance: {}", name5, obj5.getClass(), obj5);

        String name6 = "injectionComponent8";
        Object obj6 = event.getApplicationContext().getBean(name6);
        log.info("name: {}, class {}, instance: {}", name6, obj6.getClass(), obj6);

        String name7 = "injectionComponent9";
        Object obj7 = event.getApplicationContext().getBean(name7);
        log.info("name: {}, class {}, instance: {}", name7, obj7.getClass(), obj7);

        String name8 = "injectionComponent10";
        Object obj8 = event.getApplicationContext().getBean(name8);
        log.info("name: {}, class {}, instance: {}", name8, obj8.getClass(), obj8);

        String name9 = "injectionComponent11";
        Object obj9 = event.getApplicationContext().getBean(name9);
        log.info("name: {}, class {}, instance: {}", name9, obj9.getClass(), obj9);

        String name10 = "injectionComponent12";
        Object obj10 = event.getApplicationContext().getBean(name10);
        log.info("name: {}, class {}, instance: {}", name10, obj10.getClass(), obj10);

        String name11 = "injectionComponent13";
        Object obj11 = event.getApplicationContext().getBean(name11);
        log.info("name: {}, class {}, instance: {}", name11, obj11.getClass(), obj11);
    }

}
