package com.zhiyou100.servlet.rent;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.House;
import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.pojo.Rent;
import com.zhiyou100.service.RentService;
import com.zhiyou100.service.impl.RentServiceImpl;

/**
 * Servlet implementation class RentAddServlet
 */
@WebServlet("/RentAddServlet")
public class RentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RentAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int h_id=Integer.parseInt(request.getParameter("h_id"));
		int l_id=Integer.parseInt(request.getParameter("l_id"));
		Double r_money=Double.parseDouble(request.getParameter("r_money"));
		String r_remark=request.getParameter("r_remark");
		House house=new House();
		house.setH_id(h_id);
		Lessee lessee=new Lessee();
		lessee.setL_id(l_id);
		Rent rent=new Rent(r_money, null, r_remark, house, lessee);
		RentService rentService=new RentServiceImpl();
		if(rentService.add(rent)){
			response.sendRedirect(request.getContextPath()+"/RentSelectServlet");
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
