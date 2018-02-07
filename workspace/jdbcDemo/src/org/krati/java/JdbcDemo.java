package org.krati.java;

import java.sql.SQLException;

import org.krati.java.dao.JdbcDaoImpl;
import org.krati.java.dao.SimpleJdbcDaoImpl;
import org.krati.java.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		//JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		//Circle circle = dao.getCircle(1);
		//System.out.println(circle.getName());
		//System.out.println(dao.getCircleCount());
		//System.out.println(dao.getCircleName(1));
		//System.out.println(dao.getCircleForId(1).getName());
		//dao.insertCircle(new Circle(3,"Third Circle"));
		//System.out.println(dao.getAllCircle().size());
		//dao.createTriangleTable();
		//dao.insertCircle(new Circle(4,"Forth Circle"));
		//System.out.println(dao.getAllCircle().size());
		SimpleJdbcDaoImpl dao = ctx.getBean("simpleDaoJdbcDaoImpl", SimpleJdbcDaoImpl.class);
		System.out.println(dao.getCircleCount());

	}

}
