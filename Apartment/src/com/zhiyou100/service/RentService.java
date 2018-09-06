package com.zhiyou100.service;



import com.zhiyou100.pojo.Page;
import com.zhiyou100.pojo.Rent;

public interface RentService  {
	 Page<Rent> select(int page);

	 boolean add(Rent rent);
	
	 boolean delete (int r_id);
	 

}
