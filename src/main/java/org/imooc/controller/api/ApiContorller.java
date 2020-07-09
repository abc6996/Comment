package org.imooc.controller.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.imooc.bean.Ad;
import org.imooc.bean.BusinessList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "api")
public class ApiContorller {

	@RequestMapping(value = "homead", method = RequestMethod.GET)
	public List<Ad> homead() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String str = "[{'title':'暑假5折','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png','link':'http://www.imooc.com/wap/index'},{'title':'特价出国','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191648124-298129318.png','link':'http://www.imooc.com/wap/index'},{'title':'亮亮车','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191653983-1962772127.png','link':'http://www.imooc.com/wap/index'},{'title':'学钢琴','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191700420-1584459466.png','link':'http://www.imooc.com/wap/index'},{'title':'电影','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191706733-367929553.png','link':'http://www.imooc.com/wap/index'},{'title':'旅游热线','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191713186-495002222.png','link':'http://www.imooc.com/wap/index'}]";
		return mapper.readValue(str, new TypeReference<List<Ad>>() {
		});
	}

	@RequestMapping(value = "homelist/{city}/{page}", method = RequestMethod.GET)
	public BusinessList homeList() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		String str = "[{'title':'暑假5折','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png','link':'http://www.imooc.com/wap/index'},{'title':'特价出国','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191648124-298129318.png','link':'http://www.imooc.com/wap/index'},{'title':'亮亮车','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191653983-1962772127.png','link':'http://www.imooc.com/wap/index'},{'title':'学钢琴','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191700420-1584459466.png','link':'http://www.imooc.com/wap/index'},{'title':'电影','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191706733-367929553.png','link':'http://www.imooc.com/wap/index'},{'title':'旅游热线','img':'http://images2015.cnblogs.com/blog/138012/201610/138012-20161016191713186-495002222.png','link':'http://www.imooc.com/wap/index'}]";
		return mapper.readValue(str, new TypeReference<List<Ad>>() {
		});
	}

	@RequestMapping(value = "submitComment", method = RequestMethod.POST)
	public Map<String, Object> submitComment() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errno", 0);
		result.put("msg", "ok");
		return result;
	}
}
