package com.profound;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

	@RequestMapping("/hello1")
	public String show() {
		return "view1";
	}
}
