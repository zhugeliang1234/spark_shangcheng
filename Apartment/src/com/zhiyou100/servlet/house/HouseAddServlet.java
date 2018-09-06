package com.zhiyou100.servlet.house;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.service.impl.HouseServiceImpl;

/**
 * Servlet implementation class HouseAddServlet
 */
@WebServlet("/HouseAddServlet")
public class HouseAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HouseAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String a=request.getParameter("dq");
		String b=request.getParameter("xq");
		String c=request.getParameter("dy");
		int d=Integer.valueOf(request.getParameter("lc"));
		String e=request.getParameter("fj");
		Double f=Double.valueOf(request.getParameter("mj"));
		String g=request.getParameter("cx");
		String h=request.getParameter("zx");
		String i=request.getParameter("sq");
		int j=Integer.valueOf(request.getParameter("lc"));
		String k=request.getParameter("pz");
		Double l=Double.valueOf(request.getParameter("mj"));
		String m=request.getParameter("zt");
		String n=request.getParameter("dz");
		House house=new House(a, b, c, d, e, f,g, h, i, j, k,l,m, n,null, null, (byte) 1);
		HouseService houseService=new HouseServiceImpl();
		boolean bb=houseService.add(house);
		if(bb){
			response.sendRedirect(request.getContextPath()+"/HouseSelectWithPageServlet");
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
