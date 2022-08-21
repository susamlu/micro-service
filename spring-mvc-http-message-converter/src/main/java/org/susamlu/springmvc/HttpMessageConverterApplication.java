package org.susamlu.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Sam Lu
 * @date 2022/08/20
 * @see EnableWebMvc
 * @see WebMvcAutoConfiguration
 * @see WebMvcConfigurationSupport
 * @see WebMvcConfigurer
 * @see WebMvcConfigurerAdapter
 */
@SpringBootApplication
public class HttpMessageConverterApplication {

    public static void main(String[] args) {
        SpringApplication.run(HttpMessageConverterApplication.class, args);
    }

}