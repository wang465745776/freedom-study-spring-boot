package com.wangguitang.freedom.study.springboot.hello.world.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping
	public String hello() {
		return "Hello World";
	}
}
