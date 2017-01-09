package com.wongsir.springboot.web.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.wongsir.springboot.web.entity.User;

/** 
* @Description: dao接口，使用mybatis注解
* @author hjd
* @date 2017年1月9日 上午10:00:04 
*  “@Mapper”就是我们要与mybatis融合关键的一步，只要一个注解就搞定了
*/
@Mapper
public interface UserMapper {
	
	@Insert("insert into user(name,age) values(#{name},#{age})")
	int addUser(User user);  //插入用户数据
	@Select("select * from user where name = #{name}")
	User findUserByname(@Param("name")String name);  //根据用户名查询
}
