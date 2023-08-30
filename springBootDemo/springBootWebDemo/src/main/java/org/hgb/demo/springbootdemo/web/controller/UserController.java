package org.hgb.demo.springbootdemo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Value("${spring.security.user.name:testUserName}")
	private String userName;

	@Value("${spring.security.user.password: testPwd}")
	private String userPassword;

	@GetMapping("/findUser")
	public String findUser() {
		return userName + "|" + userPassword;
	}
}
