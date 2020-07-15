package org.imooc.test;

import java.io.IOException;
import java.util.List;

import org.imooc.bean.Ad;
import org.imooc.bean.User;
import org.imooc.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDao {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// test_dao();
		test_json();
	}

	private static void test_json() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		String str = "[{'title':'暑假5折','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png','link':'http://www.imooc.com/wap/index'},{'title':'特价出国','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191648124-298129318.png','link':'http://www.imooc.com/wap/index'},{'title':'亮亮车','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191653983-1962772127.png','link':'http://www.imooc.com/wap/index'},{'title':'学钢琴','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191700420-1584459466.png','link':'http://www.imooc.com/wap/index'},{'title':'电影','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191706733-367929553.png','link':'http://www.imooc.com/wap/index'},{'title':'旅游热线','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191713186-495002222.png','link':'http://www.imooc.com/wap/index'}]";
		Object value = mapper.readValue(str, new TypeReference<List<Ad>>() {
		});
		System.out.println(value);
	}

	private static void test_dao() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
//		UserDao userDao = context.getBean(UserDao.class);
		UserService userService = context.getBean(UserService.class);
		List<User> list = userService.getList();
		System.out.println("=============================");
		System.out.println(list);
	}
}
