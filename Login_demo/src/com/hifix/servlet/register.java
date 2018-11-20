package com.hifix.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.platform.engine.reporting.ReportEntry;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static Transaction t;
       private static String id;
       private static String firstname;
       private static String lastname;
       private static String password;
       private static Session session;
       private static SessionFactory factory;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charaset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		Configuration cfg=new  Configuration();
		cfg.configure("hibernate.cfg.xml");
try {
		 factory=cfg.buildSessionFactory();
		session=factory.openSession();
		t=session.beginTransaction();
		
		
		id=request.getParameter("Id");
		firstname=request.getParameter("FirstName");
		lastname=request.getParameter("LastName");
		password=request.getParameter("password");
		System.out.println(id+firstname+lastname+password);
		
		people e=new people();
		
		e.setId(Integer.parseInt(id));
		e.setFirstName(firstname);
		e.setLastName(lastname);
		e.setPassword(password);
		session.save(e);
		t.commit();
		response.sendRedirect("/Login_demo/login.jsp");
}catch(Exception e) {
	e.printStackTrace();
	
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
