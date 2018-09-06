package com.zhiyou100.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zhiyou100.dao.LesseeDao;
import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.util.DBUtil;

public class LesseeDaoImpl implements LesseeDao{

	@Override
	public List<Lessee> select(int page,int size) {
		// TODO Auto-generated method stub
		String sql="select * from lessee where l_ljsc=1 limit ?,? ";
		Object[]obj={(page-1)*size,size};
		ResultSet rs=DBUtil.select(sql, obj);
		List<Lessee>list=new ArrayList<>();
		Lessee lessee=new Lessee();
		try {
			while(rs.next()){
				int l_id=rs.getInt(1);
				String l_name=rs.getString(2);
				String l_tel=rs.getString(3);
				String l_sex=rs.getString(4);
				String l_home=rs.getString(5);
				String l_card=rs.getString(6);
				Date l_addtime=rs.getTimestamp(7);
				Byte l_ljsc=rs.getByte(8);
				lessee=new Lessee(l_id, l_name, l_tel, l_sex, l_home, l_card, l_addtime, l_ljsc);
				list.add(lessee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	

	@Override
	public int add(Lessee lessee) {
		// TODO Auto-generated method stub
		String sql="insert into lessee (l_name,l_tel,l_sex,l_home,l_card,l_ljsc) values(?,?,?,?,?,?)";
		Object[]obj={lessee.getL_name(),lessee.getL_tel(),lessee.getL_sex(),lessee.getL_home(),lessee.getL_card(),lessee.getL_ljsc()};
		int i=DBUtil.update(sql, obj);
		return i;
	}
	
	@Override
	public int delete(int l_id) {
		// TODO Auto-generated method stub
		String sql=" update lessee set l_ljsc=0 where l_id=?";
		Object[]obj={l_id};
	int i=DBUtil.update(sql, obj);
		return i;
	}

	@Override
	public Lessee findbyid(int l_id) {
		// TODO Auto-generated method stub
		String sql="select * from lessee where l_id=?";
		Object[]obj={l_id};
		ResultSet rs=DBUtil.select(sql, obj);
		Lessee lessee=new Lessee();
		try {
			while(rs.next()){
				int l_id1=rs.getInt(1);
				String l_name=rs.getString(2);
				String l_tel=rs.getString(3);
				String l_sex=rs.getString(4);
				String l_home=rs.getString(5);
				String l_card=rs.getString(6);
				Date l_addtime=rs.getTimestamp(7);
				Byte l_ljsc=rs.getByte(8);
				lessee=new Lessee(l_id1, l_name, l_tel, l_sex, l_home, l_card, l_addtime, l_ljsc);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lessee;
	}
	
	@Override
	public int update(Lessee lessee) {
		// TODO Auto-generated method stub
		String sql="update lessee set l_name=?,l_tel=?,l_sex=?,l_home=?,l_card=?";
		Object[]obj={lessee.getL_name(),lessee.getL_tel(),lessee.getL_sex(),lessee.getL_home(),lessee.getL_card()};
		int i=DBUtil.update(sql, obj);
		return i;
	}



	@Override
	public int selecttotalcount() {
		// TODO Auto-generated method stub
		String sql="select count(l_id) from lessee where l_ljsc=1 ";
		Object[]obj={};
		ResultSet rs=DBUtil.select(sql, obj);
			int a = 0;
		try {
			while(rs.next()){
				a=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}

}
