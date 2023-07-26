package com.kang.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogContollerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		return "<h1>hello spring boot</h1>";
	}
}
