package org.hgb.demo.springbootdemo.web.dependmodule.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("appConfig_dependency")
@ComponentScan(basePackages = "org.hgb.demo.springbootdemo.web.dependmodule")
public class AppConfig {
}
