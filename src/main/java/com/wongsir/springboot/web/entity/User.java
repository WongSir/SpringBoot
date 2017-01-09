package com.wongsir.springboot.web.entity;

/** 
* @Description: User实体类 
* @author hjd
* @date 2017年1月9日 上午9:58:25 
*  实体类的字段要和数据库的字段对应起来，不然就要取别名了
*/
public class User {
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
