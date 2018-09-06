package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.pojo.User;

public interface UserService {
	int select(String u_username,String u_password);
	boolean add(User user);
	List<User> selectall();
	boolean delete(int id);
}
