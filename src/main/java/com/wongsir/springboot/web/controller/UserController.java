package com.wongsir.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wongsir.springboot.web.entity.User;
import com.wongsir.springboot.web.service.UserService;

/** 
* @Description:  
* @author hjd
* @date 2017年1月9日 上午10:28:22 
*  "@RestController"是对应的restful风格的控制器
*/
@RestController
@RequestMapping("/home")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/addUser")
	public int addUser(){
		User user = new User();
		user.setName("wongsir");
		user.setAge(20);
		int addCount = userService.addUser(user);
		System.out.println("已成功插入"+addCount+"记录");
		return addCount;
	}
	
	@RequestMapping(value="/findUser")
	public String findUserByName(){
		User user = userService.findUserByName("wongsir");
		return user.getName() + "----------" + user.getAge();
	}
}
