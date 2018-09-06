package com.zhiyou100.servlet.house;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.House;
import com.zhiyou100.pojo.Page;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;

/**
 * Servlet implementation class HouseSelectWithPageServlet
 */
@WebServlet("/HouseSelectWithPageServlet")
public class HouseSelectWithPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HouseSelectWithPageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String pg=request.getParameter("page");
			int page;
		if(pg==null||pg.equals("")){ 
			page=1;
		}else{
			page=Integer.parseInt(pg);
			
		}
		HouseService houseService=new HouseServiceImpl();
		Page<House>housepage=houseService.selectwithpage(page);

		request.setAttribute("page", housepage);
		request.getRequestDispatcher("house/list.jsp").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
