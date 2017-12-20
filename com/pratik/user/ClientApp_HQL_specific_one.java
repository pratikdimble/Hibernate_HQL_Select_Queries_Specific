package com.pratik.test;

import com.pratik.domain.product;
import com.pratik.utility.HibernateUtil;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

public class ClientApp_HQL_specific_one{
	private static final String hql_select_one="select pname from product";
	public static void main(String[] args) {
		Session ses=null;
		//product prod=null;

		ses=HibernateUtil.getSession();
		Query query=null;
		query=ses.createQuery(hql_select_one);
			
			List<String> list=query.list();
			
				for(String p:list)
				{
					System.out.println(p);
				}
				
				HibernateUtil.closeFactory();
				
				System.out.print("\n\t\t ==PROGRAMME BY PRATIK DIMBLE==\n\n\n");

			
		
		

	}

}
