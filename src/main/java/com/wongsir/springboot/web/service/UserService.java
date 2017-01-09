package com.wongsir.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wongsir.springboot.web.dao.UserMapper;
import com.wongsir.springboot.web.entity.User;

/** 
* @Description: 用户业务处理类 
* @author hjd
* @date 2017年1月9日 上午10:22:07 
*  
*/
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 插入用户数据业务处理
	 * @param user 用户实体数据
	 * @return 返回插入条数记录
	 */
	public int addUser(User user){
		int addCount = userMapper.addUser(user);
		return addCount;
	}
	/**
	 * 查询用户数据业务处理类
	 * @param name 用户名
	 * @return 返回根据用户名查询到的用户数据
	 */
	public User findUserByName(String name){
		User user = userMapper.findUserByname(name);
		return user;
	}
}
