package org.susamlu.springweb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.susamlu.springweb.config.ComponentAnnotationConfig;
import org.susamlu.springweb.config.NormalAnnotationConfig;

import java.util.Arrays;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@Slf4j
@SpringBootApplication
public class ConfigApplication {

    @Autowired
    private ComponentAnnotationConfig componentAnnotationConfig;
    @Autowired
    private NormalAnnotationConfig normalAnnotationConfig;

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

    @EventListener
    public void onStartup(ApplicationReadyEvent event) {
        Arrays.stream(event.getApplicationContext().getBeanDefinitionNames())
                .sorted()
                .forEach(log::info);
    }

}