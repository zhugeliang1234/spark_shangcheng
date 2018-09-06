package com.zhiyou100.servlet.rent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.Page;
import com.zhiyou100.pojo.Rent;
import com.zhiyou100.service.RentService;
import com.zhiyou100.service.impl.RentServiceImpl;

/**
 * Servlet implementation class RentSelectServlet
 */
@WebServlet("/RentSelectServlet")
public class RentSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RentSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RentService rentService=new RentServiceImpl();
	String page=request.getParameter("page");
		int page1;
	if(page==null||page.equals("")){
		page1=1;
	}else{
		page1=Integer.parseInt(page);
	}
		Page<Rent> page2=rentService.select(page1);
		request.setAttribute("page", page2);
		request.getRequestDispatcher("rent/list.jsp").forward(request, response);
		
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
