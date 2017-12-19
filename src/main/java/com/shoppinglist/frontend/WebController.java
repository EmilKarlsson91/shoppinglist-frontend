package com.shoppinglist.frontend;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/frontend")
public class WebController {

//	@GetMapping("/")
//	String index() {
//		return "index";
//	}
	
	
	// inject via application.properties
//	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String index(Map<String, Object> model) {
		model.put("message", this.message);
		return "index";
	}

}
