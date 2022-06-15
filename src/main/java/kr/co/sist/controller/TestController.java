
package kr.co.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/hello", method=RequestMethod.GET)
	public String mainPage() {
		System.out.println("test");
		return "hello";
	}
	
	@GetMapping("/hello2")
	public String mainPage2() {
		return "day0614/hello2";
	}
	
}
