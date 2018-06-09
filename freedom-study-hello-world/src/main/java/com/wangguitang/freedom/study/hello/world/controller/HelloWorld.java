package com.wangguitang.freedom.study.hello.world.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

	@RequestMapping("greet")
	public String greet() {
		return "Hello World";
	}
}
