package com.pratik.user;

import java.util.List;

import org.hibernate.query.Query;

import com.pratik.utility.HibernateUtil;

import org.hibernate.Session;


public class ClientApp_HQL_specific_multilple {

	public static void main(String[] args) {
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
		//create the HQL query
		Query query=ses.createQuery("select pname,quantity from"
					+ " prod where price>=:id");
			//set the parameter to query
	 	int value=500;
	 		query=query.setParameter("id",value);
		//execute the query
		
		List<Object[]> list=query.list();
		//display the result
		 	for(Object[] row:list)
		 	{
		 		System.out.println("\t"+row[0]+"\t"+row[1]);
			}
	
			//close the session and session factory
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeFactory();
	System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");
	}//main(-,-)
}//class
