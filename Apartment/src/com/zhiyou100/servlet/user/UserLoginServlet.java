package com.zhiyou100.servlet.user;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.UserService;
import com.zhiyou100.service.impl.UserServiceImpl;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		UserService userService=new UserServiceImpl();
		int a=userService.select(username, password);
		
		if(a==0){
			request.setAttribute("tip1", "账号不存在,请重新输入");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else if(a==1){
			request.getSession().setAttribute("username", username);
			request.getRequestDispatcher("admin.jsp").forward(request, response);
		}else{
			
			request.setAttribute("tip1", "密码错误，请重新输入");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}	
		
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
