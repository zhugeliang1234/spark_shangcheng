package com.zhiyou100.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	
		/**
		 * 连接数据库的url
		 */
		private static String url="jdbc:mysql://192.168.6.97:3306/ldwapartment";
		/**
		 * 数据库账号
		 */
		private static String user="root";
		private static String password="root";
		private static Connection connection;
		private static PreparedStatement ps;
		private static ResultSet rs;
		
		/**
		 * 1、加载驱动
		 * 2，建立连接
		 */
		public static  Connection  getConnection(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("驱动加载成功");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("驱动加载失败");
				e.printStackTrace();
			}
			
			try {
				connection=DriverManager.getConnection(url, user, password);
				System.out.println("连接成功");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("连接失败");
				e.printStackTrace();
			}
			return connection;
			
		}
		
		
		/**
		 * 6.释放资源
		 * @throws SQLException 
		 */
		public static void close() throws SQLException{
			if(rs!=null){
				rs.close();
			}
			
			if(ps!=null){
				ps.close();
			}
			
			if(connection!=null){
				connection.close();
			}
		}
		
		
		
		/**
		 * 3/准备sql语句
		 * 4.执行sql语句
		 * 5.处理结果 
		 */
		
		
		
		/**
		 * 查询
		 * @param sql  sql语句  selct * from emp where e_age=? and e_name=?
		 * @param obj  object数组是sql语句里面的？的值
		 * @return    结果集
		 */
		public static ResultSet select(String sql,Object[]obj){
			// 1加载驱动  2建立连接
			connection=getConnection();
			//3准备sql语句  参数String sql
			try {
				ps=connection.prepareStatement(sql);
				//给sql里面的问号赋值
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//4执行sql语句
			try {
				rs=ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return rs;
			
		}
		
		
		/**
		 * 修改
		 * @param sql  增加 修改 删除 都是修改操作
		 * @param obj  传递的参数
		 * @return     修改了几个
		 */
		public static int update(String sql,Object[]obj){
			//1 加载驱动 2 建立连接
			connection =getConnection();
			//3.准备sql语句
			try {
				ps=connection.prepareStatement(sql);
				//给sql里面的问号赋值
				for(int i=0;i<obj.length;i++){
					ps.setObject(i+1, obj[i]);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//4.执行sql语句
			int a=0;
			try {
				 a=ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return a;
		}
		
	}

