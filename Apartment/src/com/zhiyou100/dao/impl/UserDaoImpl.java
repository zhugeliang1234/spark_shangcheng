package com.zhiyou100.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zhiyou100.dao.UserDao;
import com.zhiyou100.pojo.User;
import com.zhiyou100.util.DBUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public User select(String u_name) {
		
		Object[]obj={u_name};
		String sql="select * from user where u_username=?";
		ResultSet rs=DBUtil.select(sql, obj);
		User user=null;
		try {
			while(rs.next()){
			int u_id=rs.getInt(1);
			String u_username=rs.getString(2);
			String u_password=rs.getString(3);
			String u_name1=rs.getString(4);
			String u_tel=rs.getString(5);
			String u_sex=rs.getString(6);
			user=new User(u_id, u_username, u_password, u_name1, u_tel, u_sex);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		try {
			DBUtil.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		Object[]obj={user.getU_username(),user.getU_password(),user.getU_name(),user.getU_tel(),user.getU_sex()};
		String sql="insert into user (u_username,u_password,u_name,u_tel,u_sex) values(?,?,?,?,?)";
		try {
			DBUtil.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return DBUtil.update(sql, obj);
		
		}


	@Override
	public List<User> selectall() {
		
		Object[]obj={};
		String sql="select * from user";
		ResultSet rs=DBUtil.select(sql, obj);
		List<User>list=new ArrayList<>();
		try {
			while(rs.next()){
			int u_id=rs.getInt(1);
			String u_username=rs.getString(2);
			String u_password=rs.getString(3);
			String u_name1=rs.getString(4);
			String u_tel=rs.getString(5);
			String u_sex=rs.getString(6);
			User user=new User(u_id, u_username, u_password, u_name1, u_tel, u_sex);
			list.add(user);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		try {
			DBUtil.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from user where u_id=?";
		Object[]obj={id};
		int i=DBUtil.update(sql, obj);
		return i;
	}
}
