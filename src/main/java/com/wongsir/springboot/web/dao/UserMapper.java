package com.wongsir.springboot.web.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wongsir.springboot.web.entity.User;

/** 
* @Description: dao�ӿڣ�ʹ��mybatisע��
* @author hjd
* @date 2017��1��9�� ����10:00:04 
*  ��@Mapper����������Ҫ��mybatis�ںϹؼ���һ����ֻҪһ��ע��͸㶨��
*/
@Mapper
public interface UserMapper {
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	int addUser(User user);  //�����û�����
	@Select("select * from user where name = #{name}")
	User findUserByname(@Param("name")String name);  //�����û�����ѯ
}
