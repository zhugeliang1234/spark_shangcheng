package com.zhiyou100.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.pojo.House;
import com.zhiyou100.util.DBUtil;

public class HouseDaoImpl implements HouseDao {

	@Override
	public List<House> selectwithpage(int page, int size) {
		String sql="select * from house where h_ljsc=1  limit ?,?";
		// TODO Auto-generated method stub
		Object[]obj={(page-1)*size,size};
		ResultSet rs=DBUtil.select(sql, obj);
		List<House>list=new ArrayList<>();
		try {
			while(rs.next()){
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				int e=rs.getInt(5);
				String f=rs.getString(6);
				Double g=rs.getDouble(7);
				String h=rs.getString(8);
				String i=rs.getString(9);
				String j=rs.getString(10);
				int k=rs.getInt(11);
				String l=rs.getString(12);
				Double m=rs.getDouble(13);
				String n=rs.getString(14);
				String o=rs.getString(15);
				Date  p=rs.getTimestamp(16);
				Date  q=rs.getTimestamp(17);
				Byte  r=rs.getByte(18);
				House house=new House(a, b, c, d, e, f,g,h,i,j,k,l,m,n,o,p,q,r);
				list.add(house);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getMessageCount() {
		// TODO Auto-generated method stub
		String sql="select count(h_id) from house where h_ljsc=1";
		Object[]objects={};
		ResultSet rs=DBUtil.select(sql, objects);
		int count=0;
		try {
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int add(House house) {
		// TODO Auto-generated method stub
		String sql="insert into house (h_dq,h_xq,h_dy,h_lc,h_fj,h_mj,h_cx,"
				+ "h_zx,h_sq,h_xz,h_pz,h_jg,h_zt,h_dz,h_ljsc) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Object[]objects={house.getH_dq(),house.getH_xq(),house.getH_dy(),
				house.getH_lc(),house.getH_fj(),house.getH_mj(),house.getH_cx(),
				house.getH_zx(),house.getH_sq(),house.getH_xz(),house.getH_pz(),
				house.getH_jg(),house.getH_zt(),house.getH_dz(),
				house.getHd_ljsc()};
		int a=DBUtil.update(sql, objects);
		return a;
	}

	@Override
	public int delete(int h_id) {
		// TODO Auto-generated method stub
		String sql="update house set h_ljsc=0 where h_id=?";
		Object[]obj={h_id};
		int i=DBUtil.update(sql, obj);
		return i;
	}

	public House findbyid(int h_id) {
		// TODO Auto-generated method stub
		String sql="select * from house where h_id=?";
		Object[]obj={h_id};
		ResultSet rs=DBUtil.select(sql, obj);
		House house=new House();
		try {
			while(rs.next()){
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				int e=rs.getInt(5);
				String f=rs.getString(6);
				Double g=rs.getDouble(7);
				String h=rs.getString(8);
				String i=rs.getString(9);
				String j=rs.getString(10);
				int k=rs.getInt(11);
				String l=rs.getString(12);
				Double m=rs.getDouble(13);
				String n=rs.getString(14);
				String o=rs.getString(15);
				Date  p=rs.getTimestamp(16);
				Date  q=rs.getTimestamp(17);
				Byte  r=rs.getByte(18);
				house=new House(a, b, c, d, e, f,g,h,i,j,k,l,m,n,o,p,q,r);
				
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;
	}	

	@Override
	public int update(House house) {
		// TODO Auto-generated method stub
		String sql="update house set h_dq=?,h_xq=?,h_dy=?,h_lc=?,h_fj=?,"
				+ "h_mj=?,h_cx=?,h_zx=?,h_sq=?,h_xz=?,"
				+ "h_pz=?,h_jg=?,h_zt=?,h_dz=?,h_xgsj=? where h_id=?";
		Object[]obj={house.getH_dq(),house.getH_xq(),house.getH_dy(),house.getH_lc(),house.getH_fj()
				,house.getH_mj(),house.getH_cx(),house.getH_zx(),house.getH_sq(),house.getH_xz()
				,house.getH_pz(),house.getH_jg(),house.getH_zt(),house.getH_dz(),house.getH_xgsj(),house.getH_id()};
		int i=DBUtil.update(sql, obj);
		return i;
	}

	@Override
	public List<House> selectlike(String zd, String zfc) {
		String sql="select * from house where ? like %?%";
		// TODO Auto-generated method stub
		Object[]obj={zd,zfc};
		ResultSet rs=DBUtil.select(sql, obj);
		List<House>list=new ArrayList<>();
		try {
			while(rs.next()){
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				int e=rs.getInt(5);
				String f=rs.getString(6);
				Double g=rs.getDouble(7);
				String h=rs.getString(8);
				String i=rs.getString(9);
				String j=rs.getString(10);
				int k=rs.getInt(11);
				String l=rs.getString(12);
				Double m=rs.getDouble(13);
				String n=rs.getString(14);
				String o=rs.getString(15);
				Date  p=rs.getTimestamp(16);
				Date  q=rs.getTimestamp(17);
				Byte  r=rs.getByte(18);
				House house=new House(a, b, c, d, e, f,g,h,i,j,k,l,m,n,o,p,q,r);
				list.add(house);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
