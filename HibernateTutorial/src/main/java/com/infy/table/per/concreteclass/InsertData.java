package com.infy.table.per.concreteclass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class InsertData {
	
	public static void main(String[] args) {
		
		AnnotationConfiguration cfg=new AnnotationConfiguration();  
		Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  

		Transaction t=session.beginTransaction();  

		Employee e1=new Employee();  
		e1.setName("Santhosh");  

		Regular_Employee e2=new Regular_Employee();  
		e2.setName("Shahul");  
		e2.setSalary(50000);  
		e2.setBonus(5);  

		Contract_Employee e3=new Contract_Employee();  
		e3.setName("Kalai");  
		e3.setPay_per_year(1000);  
		e3.setContact_duration("15 hours");  

		session.persist(e1);  
		session.persist(e2);  
		session.persist(e3);  

		t.commit();  
		session.close();  
		System.out.println("success");  
		
	}
	
}
