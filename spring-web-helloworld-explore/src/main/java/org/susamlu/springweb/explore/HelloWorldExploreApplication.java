package org.susamlu.springweb.explore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sam Lu
 * @date 2022/08/16
 */
@SpringBootApplication
public class HelloWorldExploreApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldExploreApplication.class, args);
    }

    @Bean
    @ConditionalOnClass
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}