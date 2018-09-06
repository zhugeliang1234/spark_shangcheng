package com.zhiyou100.servlet.lessee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.service.LesseeService;
import com.zhiyou100.service.impl.LesseeServiceImpl;

/**
 * Servlet implementation class LesseeDeleteServlet
 */
@WebServlet("/LesseeDeleteServlet")
public class LesseeDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LesseeDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int l_id=Integer.parseInt(request.getParameter("l_id"));
		LesseeService lesseeService=new LesseeServiceImpl();
		
		boolean b=lesseeService.delete(l_id);
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
