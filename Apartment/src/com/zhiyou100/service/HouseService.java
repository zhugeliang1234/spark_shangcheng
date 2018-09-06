package com.zhiyou100.service;


import java.util.List;

import com.zhiyou100.pojo.House;
import com.zhiyou100.pojo.Page;

public interface HouseService {
	Page<House> selectwithpage(int page);
	boolean add(House house);
	
	boolean delete(int h_id);//实际是对ljsc的操作
	House findbyid(int h_id);
	boolean update(House house);
	List<House> selectlike(String zd,String zfc);
}
