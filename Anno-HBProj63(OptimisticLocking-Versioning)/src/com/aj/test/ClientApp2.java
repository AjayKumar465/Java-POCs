package com.aj.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.aj.domain.Student;
import com.aj.utility.HibernateUtil;

public class ClientApp2 {

	public static void main(String[] args) {
		Session ses=null;
		Student st=null;
		Transaction tx=null;
		//get Session
		ses=HibernateUtil.getSession();
		//load object
		st=(Student)ses.get(Student.class,101);
		try{
		  tx=ses.beginTransaction();
		     st.setAddress("hyd16");
		    ses.update(st);
		  tx.commit();
		  System.out.println("Client2 has updated the record");
		 
		}//try
		catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}

		 System.out.println("Version--->"+st.getVer());
      //close Session
		HibernateUtil.closeSession();
		//close SessionFactory
		HibernateUtil.closeSessionFactory();
	}//main
}//class
