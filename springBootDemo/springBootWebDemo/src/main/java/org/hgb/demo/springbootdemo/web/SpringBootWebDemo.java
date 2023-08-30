package org.hgb.demo.springbootdemo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
//@ComponentScans({@ComponentScan("org.hgb.demo.springbootdemo.web")})
public class SpringBootWebDemo {
	private static Logger logger = LoggerFactory.getLogger(SpringBootWebDemo.class);
	public static void main(String[] args) {
		logger.info("begin to start my springBoot web demo");
		SpringApplication.run(SpringBootWebDemo.class, args);
		logger.info("success start my springBoot web demo");
	}
}
