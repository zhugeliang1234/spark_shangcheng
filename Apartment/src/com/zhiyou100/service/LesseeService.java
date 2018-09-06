package com.zhiyou100.service;



import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.pojo.Page;

public interface LesseeService {
	Page<Lessee> select(int page);
	
	
	
	boolean add(Lessee lessee);
	
	 boolean delete (int l_id);
	 
	 Lessee findbyid(int l_id);
	 
	 boolean update(Lessee lessee);
}
