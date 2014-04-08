package org.yankun.kms.web.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.yankun.kms.service")
@PropertySource("classpath:/properties/test.properties")
public class AppConfig {

}
