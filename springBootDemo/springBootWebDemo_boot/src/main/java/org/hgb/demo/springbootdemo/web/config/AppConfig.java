package org.hgb.demo.springbootdemo.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.hgb.demo.springbootdemo.web.dependmodule.aaa")
public class AppConfig {
}
