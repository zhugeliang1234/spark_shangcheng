package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.dao.impl.HouseDaoImpl;
import com.zhiyou100.pojo.House;
import com.zhiyou100.pojo.Page;
import com.zhiyou100.service.HouseService;

public class HouseServiceImpl implements HouseService{
	HouseDao houseDao=new HouseDaoImpl();
	@Override
	public Page<House> selectwithpage(int page) {
		// TODO Auto-generated method stub
		List<House>list=houseDao.selectwithpage(page, 4);
		int messagecount=houseDao.getMessageCount();
		Page<House>pageinfo=new Page<>();
		pageinfo.setTotalCount(messagecount);
		pageinfo.setCurrentPage(page);
		pageinfo.setList(list);
		pageinfo.setPageSize(4);
		return pageinfo;
	}
	@Override
	public boolean add(House house) {
		// TODO Auto-generated method stub
		int a=houseDao.add(house);
		if(a>0){
			return true;
		}
		return false;
	}
	@Override
	public boolean delete(int h_id) {
		// TODO Auto-generated method stub
		int a=houseDao.delete(h_id);
		if(a>0){
			return true;
		}
		return false;
	}
	public House findbyid(int h_id) {
		// TODO Auto-generated method stub
		return houseDao.findbyid(h_id);
	}
	@Override
	public boolean update(House house) {
		// TODO Auto-generated method stub
		int a=houseDao.update(house);
		if(a>0){
			return true;
		}
		return false;
	}
	@Override
	public List<House> selectlike(String zd, String zfc) {
		// TODO Auto-generated method stub
		return houseDao.selectlike(zd, zfc);
	}
		
}
