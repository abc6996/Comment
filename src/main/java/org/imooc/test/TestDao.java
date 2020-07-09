package org.imooc.test;

import java.util.List;

import org.imooc.bean.User;
import org.imooc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {
	public static void main(String[] args) {
		test_dao();
	}

	private static void test_dao() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		UserDao userDao = context.getBean(UserDao.class);
		UserService userService = context.getBean(UserService.class);
		List<User> list = userService.getList();
		System.out.println(list);
	}
}
