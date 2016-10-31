package dhy.lucifer.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/index/index.html")
	public String index() {
		return "index";
	}

	@RequestMapping("/index/login.html")
	public String login() {
		return "login";
	}
}
