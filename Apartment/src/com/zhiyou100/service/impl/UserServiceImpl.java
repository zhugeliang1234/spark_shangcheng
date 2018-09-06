package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.UserDao;
import com.zhiyou100.dao.impl.UserDaoImpl;
import com.zhiyou100.pojo.User;
import com.zhiyou100.service.UserService;

public class UserServiceImpl implements UserService{

	UserDao userDao=new UserDaoImpl();
	@Override
	public int  select(String u_username,String u_password) {
		// TODO Auto-generated method stub
		User user=userDao.select(u_username);
		if(user!=null){
			if(user.getU_password().equals(u_password)){
				return 1;
			}else{
				return 2;
			}
			
		}else{
			return 0;
		}
	}

	@Override
	public boolean add(User user) {
	int i=userDao.add(user);
	if(i>0){
		return true;
	}
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> selectall() {
		// TODO Auto-generated method stub
		return userDao.selectall();
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
	int i=userDao.delete(id);
	if(i>0){
		return true;
	}
		return false;	
	}

}
