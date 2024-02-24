package com.test.common;

import org.hibernate.Session;

import com.test.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("5555");
        stock.setStockName("test");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}
