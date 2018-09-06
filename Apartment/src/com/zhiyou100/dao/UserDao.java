package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.pojo.User;

public interface UserDao {
	/**
	 * 
	 * @param u_name
	 * @return
	 */
	User select(String u_name);
	List<User>selectall();
	/**
	 * 
	 * @param user
	 * @return
	 */
	int add(User user);
	int delete(int id);
}
