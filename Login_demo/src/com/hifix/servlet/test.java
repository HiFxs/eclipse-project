package com.hifix.servlet;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;



public class test {
private Transaction t=null;
@Test
public void test() {
	Configuration cfg=new  Configuration();
	cfg.configure("hibernate.cfg.xml");
	try {	
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	 t=session.beginTransaction();
	Query query=session.createQuery("from people where id=?").setString(0, "1");
	List<people> list=query.list();
	for(people s:list) {
		System.out.println(s.getId()+s.getFirstName()+s.getLastName()+s.getPassword());
	}
	people e=new people();
	e.setId(1234);
	e.setFirstName("111");
	e.setLastName("pppp");
	e.setPassword("1314");
	session.save(e);
	t.commit();
	}catch(Exception e) {
	t.rollback();
	}			
	
}

}
