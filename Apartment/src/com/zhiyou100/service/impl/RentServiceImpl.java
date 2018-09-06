package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.RentDao;
import com.zhiyou100.dao.impl.RentDaoImpl;
import com.zhiyou100.pojo.Page;
import com.zhiyou100.pojo.Rent;
import com.zhiyou100.service.RentService;

public class RentServiceImpl implements RentService{
	RentDao rentDao=new RentDaoImpl();

	@Override
	public Page<Rent> select(int page) {
		Page<Rent>page2=new Page<>();
		page2.setPageSize(4);
		page2.setTotalCount(rentDao.selecttotalcount());
		page2.setCurrentPage(page);
		List<Rent>list=rentDao.select(page, page2.getPageSize());
		page2.setList(list);
		// TODO Auto-generated method stub
		return page2;
	}

	@Override
	public boolean add(Rent rent) {
		int i=rentDao.add(rent);
		// TODO Auto-generated method stub
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int r_id) {
		// TODO Auto-generated method stub
		int i=rentDao.delete(r_id);
		if(i>0){
			return true;
		}
		return false;
	}


}
