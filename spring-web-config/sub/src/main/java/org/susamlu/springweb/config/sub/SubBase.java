package org.susamlu.springweb.config.sub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.susamlu.springweb.config.sub.component.SubComponent;

/**
 * @author Sam Lu
 * @date 2022/10/26
 */
public class SubBase {

    @Bean
    SubComponent getSubComponent() {
        return new SubComponent();
    }

}
