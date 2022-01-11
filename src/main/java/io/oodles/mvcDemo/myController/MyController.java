package io.oodles.mvcDemo.myController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/Date")
	public String showDate() {
		return "Date";
	}
}
