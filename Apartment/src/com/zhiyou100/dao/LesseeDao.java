package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.pojo.Lessee;

public interface LesseeDao {
	List<Lessee> select(int page,int size);
	int  selecttotalcount(); 
	
	
	int add(Lessee lessee);
	
	 int delete (int l_id);
	 
	 Lessee findbyid(int l_id);
	 
	 int update(Lessee lessee);
}
