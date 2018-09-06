package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.pojo.Rent;

public interface RentDao {
	List<Rent> select(int page,int size);
	int  selecttotalcount(); 
	
	
	int add(Rent rent);
	
	 int delete (int r_id);

	
	
}
