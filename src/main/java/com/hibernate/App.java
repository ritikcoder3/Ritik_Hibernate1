package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class App {

	public static void main(String[] args) {
		
		
	  Configuration cfg=new Configuration().configure("com/hibernate/config/hibernate.cfg.xml");
	  SessionFactory fs=cfg.buildSessionFactory();
	  Session session=fs.openSession();
	  Transaction tx= session.beginTransaction();
	  
          //----------insert Operation----------- 
//	 try { 
//		 Student st1=new Student(5,"Muskan","Female","muskan123@gmail.com","Delhi");
//		 session.save(st1);
//	     tx.commit();
//	      
//	     System.out.println();
//	     System.out.println("STUDENTS DETAILS INSERT SUCCESSFULL......");
//	  }catch(Exception e){
//		  tx.getRollbackOnly();
//		  e.printStackTrace();
//		  }
	  
	      
	    //----------Select(Read) Operation-----------	
//	  try {
//		  Student st= session.get(Student.class,1);
//	 
//		  if(st !=null) {
//		  System.out.println(st.getId());
//		  System.out.println(st.getName());
//		  System.out.println(st.getGender());
//		  System.out.println(st.getEmail());
//		  System.out.println(st.getCity());
//		  System.out.println();
//		  System.out.println("STUDENTS DETAILA READ SUCCESSFULLY.........");
//	    }
//	     else {
//		      System.out.println("STUDENT NOT FOUND");
//		    }
//
//	  }catch(Exception e) {
//		  e.printStackTrace();
//	  }
	  
	  
	  
      //----------update Operation----------- 
//    try { 
//    	Student st =session.get(Student.class, 1);
//    	st.setName("Neha");
//    	st.setEmail("neha123@gmail.com");
//    	st.setCity("GZB");
//    	st.setGender("Female");
//	    session.saveOrUpdate(st);
//	  
//        tx.commit();
//     
//       
//        System.out.println();
//        System.out.println("STUDENTS DETAILS UPDATE SUCCESSFULL......");
//     }catch(Exception e){
//	    tx.getRollbackOnly();
//	    e.printStackTrace();
//	  }
//	  
    
	  
	       //----------DELETE Operation----------
	  try {
		  Student st= new Student();
		   st.setId(7);
		  session.delete(st);
		  tx.commit();
			  
		 System.out.println();
	     System.out.println("STUDENT DATA SUCCESSFULLY DELETED.......");
		  
		  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	}

}