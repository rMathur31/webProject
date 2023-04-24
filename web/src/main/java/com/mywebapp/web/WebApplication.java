package com.mywebapp.web;

import javax.servlet.RequestDispatcher;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dao.Customer;
import model.User;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		/*
		 * 
		 * Customer c1 = new Customer(101, "Ritika");
		 * 
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 * SessionFactory factory = cfg.buildSessionFactory(); Session s =
		 * factory.openSession(); s.beginTransaction(); s.save(c1);
		 * s.getTransaction().commit(); s.close();
		 */
		 
	}

}
