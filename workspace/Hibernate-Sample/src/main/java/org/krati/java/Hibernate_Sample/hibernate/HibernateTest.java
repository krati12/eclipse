package org.krati.java.Hibernate_Sample.hibernate;

import java.util.Date;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.krati.java.Hibernate_Sample.dto.UserDetails;
import org.krati.java.Hibernate_Sample.dto.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
	UserDetails user=new UserDetails();
	user.setUserName("First User");
	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleName("Car");
	Vehicle vehicle2 = new Vehicle();
	vehicle2.setVehicleName("Jeep");
	user.getVehicle().add(vehicle);
	user.getVehicle().add(vehicle2);
	/*vehicle.setUser(user);
	vehicle2.setUser(user);*/
	vehicle.getUserList().add(user);
	vehicle2.getUserList().add(user);

		
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(vehicle);
	session.save(vehicle2);
	session.getTransaction().commit();
	session.close();
	

	

	}

}
