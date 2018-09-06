package com.zhiyou100.servlet.lessee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhiyou100.pojo.Lessee;
import com.zhiyou100.pojo.Page;
import com.zhiyou100.service.LesseeService;
import com.zhiyou100.service.impl.LesseeServiceImpl;

/**
 * Servlet implementation class LesseeSelectServlet
 */
@WebServlet("/LesseeSelectServlet")
public class LesseeSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LesseeSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pg=request.getParameter("page");
		int page1;
		if(pg==null||pg.equals("")){
			page1=1;
		}else{
			page1=Integer.parseInt(pg);
		}
		LesseeService lesseeService=new LesseeServiceImpl();
		Page<Lessee>page=lesseeService.select(page1);
		request.setAttribute("page", page);
		request.getRequestDispatcher("lessee/list.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
