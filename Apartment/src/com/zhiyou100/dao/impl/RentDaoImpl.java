package com.zhiyou100.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zhiyou100.dao.RentDao;
import com.zhiyou100.pojo.House;
import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.pojo.Rent;
import com.zhiyou100.util.DBUtil;

public class RentDaoImpl implements RentDao {

	@Override
	public List<Rent> select(int page, int size) {
		// TODO Auto-generated method stub
		String sql="SELECT r.r_id,h.h_id,l.l_id,r.r_money,r.r_time,r.r_remark "
				+ "FROM rent r "
				+ "INNER JOIN house h "
				+ "ON r.h_id=h.h_id "
				+ "INNER JOIN lessee l "
				+ "ON r.l_id=l.l_id "
				+ "limit ?,?";
		Object[]obj={(page-1)*size,size};
		ResultSet rs=DBUtil.select(sql, obj);
		List<Rent>list=new ArrayList<>();
		House house=new House();
		Lessee lessee=new Lessee();
		Rent rent=new Rent();
		try {
			while(rs.next()){
			int r_id=rs.getInt(1);
			int h_id=rs.getInt(2);
			int l_id=rs.getInt(3);
			Double r_money=rs.getDouble(4);
			Date r_time=rs.getTimestamp(5);
			String r_remark=rs.getString(6);
			house.setH_id(h_id);
			lessee.setL_id(l_id);
			rent=new Rent(r_id, r_money, r_time, r_remark, house, lessee);
			list.add(rent);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int selecttotalcount() {
		// TODO Auto-generated method stub
		String sql="select count(r_id) from rent";
		Object[]obj={};
		ResultSet rs=DBUtil.select(sql, obj);
		int totalcount=0;
		try {
			while(rs.next()){
				totalcount=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return totalcount;
	}	

	@Override
	public int add(Rent rent) {
		// TODO Auto-generated method stub
		String sql="insert into rent(h_id,l_id,r_money,r_remark) values(?,?,?,?)";
		Object[]obj={rent.getHouse().getH_id(),rent.getLessee().getL_id(),rent.getR_money(),rent.getR_remark()};
		int i=DBUtil.update(sql, obj);
		return i;
	}

	@Override
	public int delete(int r_id) {
		// TODO Auto-generated method stub
		String sql="delete from rent where r_id=? ";
		Object[]obj={r_id};
		int i=DBUtil.update(sql, obj);
		return i;
	}
}
