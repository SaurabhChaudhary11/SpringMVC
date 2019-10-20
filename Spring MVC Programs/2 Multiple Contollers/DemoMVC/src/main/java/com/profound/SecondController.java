package com.profound;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	@RequestMapping("/hello2")
	public String show() {
		return "view2";
	}
}
