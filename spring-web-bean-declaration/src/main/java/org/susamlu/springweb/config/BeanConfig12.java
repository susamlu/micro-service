package org.susamlu.springweb.config;

import org.springframework.boot.autoconfigure.jdbc.JdbcProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.susamlu.springweb.component.MyComponent2;
import org.susamlu.springweb.component.MyRestTemplate7;

/**
 * @author Sam Lu
 * @date 2022/11/25
 */
@Configuration
@Import({JdbcProperties.class, MyRestTemplate7.class, MyRestTemplate7.class})
public class BeanConfig12 {
}
