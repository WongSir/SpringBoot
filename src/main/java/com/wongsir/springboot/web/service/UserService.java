package com.wongsir.springboot.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wongsir.springboot.web.dao.UserMapper;
import com.wongsir.springboot.web.entity.User;

/** 
* @Description: �û�ҵ������ 
* @author hjd
* @date 2017��1��9�� ����10:22:07 
*  
*/
@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * �����û�����ҵ����
	 * @param user �û�ʵ������
	 * @return ���ز���������¼
	 */
	public int addUser(User user){
		int addCount = userMapper.addUser(user);
		return addCount;
	}
	/**
	 * ��ѯ�û�����ҵ������
	 * @param name �û���
	 * @return ���ظ����û�����ѯ�����û�����
	 */
	public User findUserByName(String name){
		User user = userMapper.findUserByname(name);
		return user;
	}
}
