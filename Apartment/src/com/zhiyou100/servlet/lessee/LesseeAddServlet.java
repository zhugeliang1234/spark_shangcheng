package com.zhiyou100.servlet.lessee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.service.LesseeService;
import com.zhiyou100.service.impl.LesseeServiceImpl;

/**
 * Servlet implementation class LesseeAddServlet
 */
@WebServlet("/LesseeAddServlet")
public class LesseeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LesseeAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String tel=request.getParameter("tel");
		String sex=request.getParameter("sex");
		String home=request.getParameter("home");
		String card=request.getParameter("card");
		Lessee lessee=new Lessee(name, tel, sex, home, card, null, (byte) 1);
		LesseeService lesseeService=new LesseeServiceImpl();
		boolean b=lesseeService.add(lessee);
		if(b){
			response.sendRedirect(request.getContextPath()+"/LesseeSelectServlet");
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
