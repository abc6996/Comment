package org.imooc.controller.content;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "ad")
public class AdController {

	@RequestMapping
	public String init() {
		return "/content/adList";
	}

	@RequestMapping("/addInit")
	public String addInit() {
		return "/content/adAdd";
	}
}
