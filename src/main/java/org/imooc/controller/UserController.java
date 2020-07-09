package org.imooc.controller;

import java.util.List;

import org.imooc.bean.User;
import org.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "allUser")
	public void getAllUser(Model model) throws Exception {
		List<User> list = userService.getList();
		// System.out.println(list);
		model.addAttribute("list", list);
	}
}
