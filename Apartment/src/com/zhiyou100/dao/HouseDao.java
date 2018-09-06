package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.pojo.House;

public interface HouseDao {
  
	List<House> selectwithpage(int page,int size);
	int getMessageCount();
	
	int add(House house);
	
	int delete(int h_id);//实际是对ljsc的操作
	House findbyid(int h_id);
	int update(House house);
	
	List<House> selectlike(String zd,String zfc);
	
}
