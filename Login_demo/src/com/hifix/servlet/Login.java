package com.hifix.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static Transaction t;
       private static String pass=null;
       private static String idd;
       private PrintWriter out;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Configuration cfg=new  Configuration();
		cfg.configure("hibernate.cfg.xml");
		try {	
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		t=session.beginTransaction();
		
		
		//设置相应类型和编码格式
		response.setContentType("text/html;charaset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		out = response.getWriter();
		idd=request.getParameter("username");
		Query query=session.createQuery("from people where id=?").setString(0, idd);
		List<people> list=query.list();
		for(people s:list) {
			System.out.println(s.getId()+s.getFirstName()+s.getLastName()+s.getPassword());
			pass=s.getPassword();
		}
		t.commit();
		}catch(Exception e) {
		t.rollback();
		}
		if(pass.equals(request.getParameter("password"))) {
		//密码和用户名一致显示用户信息	
		 String docType = "<!DOCTYPE html> \n";     
		 out.println(docType +
	            "<html>\n" +
	            "<head><title>" +"登录信息" + "</title></head>\n" +
	            "<body bgcolor=\"#f0f0f0\">\n" +
	            "<h1 align=\"center\">" +"登录信息" + "</h1>\n" +
	            "<ul>\n" +
	            "  <li><b>姓名</b>\n"
	            +request.getParameter("username")+ "\n" +
	            "  <li><b>密码</b>\n"
	            + request.getParameter("password") + "\n" +
	            "</ul>\n" +
	            "</body></html>");
		}else {
			request.getRequestDispatcher("/WebContent/404.jsp").forward(request, response);
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
