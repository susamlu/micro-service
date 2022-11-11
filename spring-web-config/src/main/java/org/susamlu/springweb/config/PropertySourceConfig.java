package org.susamlu.springweb.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Sam Lu
 * @date 2022/11/04
 */
@Slf4j
@Configuration
@PropertySource("custom.properties")
public class PropertySourceConfig implements InitializingBean {

    @Value("${custom.configA}")
    private String testConfig;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("testConfig: {}", testConfig);
    }

}
