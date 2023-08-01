package com.kang.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		System.out.println("tempHome()");
		return "test";
	}
}
