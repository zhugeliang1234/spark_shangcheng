package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.LesseeDao;
import com.zhiyou100.dao.impl.LesseeDaoImpl;
import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.pojo.Page;
import com.zhiyou100.service.LesseeService;

public class LesseeServiceImpl implements LesseeService{
	LesseeDao lesseeDao=new LesseeDaoImpl();
	
	@Override
	public Page<Lessee> select(int page) {
		// TODO Auto-generated method stub
		int i=lesseeDao.selecttotalcount();
		Page<Lessee>page2=new Page<>();
		page2.setPageSize(4);
		page2.setTotalCount(i);
		page2.setCurrentPage(page);
		List<Lessee>list=lesseeDao.select(page, page2.getPageSize());
		page2.setList(list);
		return page2;
	} 	
	
	@Override
	public boolean add(Lessee lessee) {
		// TODO Auto-generated method stub
		System.out.println("lesseerviceci");
		int i=lesseeDao.add(lessee);
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int l_id) {
		// TODO Auto-generated method stub
		int i=lesseeDao.delete(l_id);
		if(i>0){
			return true;
		}
		return false;
	}

	@Override
	public Lessee findbyid(int l_id) {
		// TODO Auto-generated method stub
		return lesseeDao.findbyid(l_id);
	}

	@Override
	public boolean update(Lessee lessee) {
		// TODO Auto-generated method stub
		int i=lesseeDao.update(lessee);
		if(i>0){
			return true;
		}
		return false;
	}

}
