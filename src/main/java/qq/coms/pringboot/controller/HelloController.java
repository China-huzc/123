package qq.coms.pringboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import qq.coms.pringboot.pojo.User;


@RequestMapping("helloController")
@Controller
public class HelloController {
	public String hello(){
		return "hello!!!!";
	}
	@ResponseBody
	@RequestMapping("/handle1")
	public User handle1(){
		 return new User(1,"tom",12);
	}
	public List<User> handle2(){
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "tom", 12));
		list.add(new User(2, "jerry", 12));
		list.add(new User(3, "张三", 12));
		return list;
	}
	@ResponseBody
	@RequestMapping("/handle3")
	public Map<String,String> handle3(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("aa", "1");
		map.put("cc", "2");
		map.put("dd", "3");
		map.put("ab", "4");
		return map;
	}
	
	
	
}
