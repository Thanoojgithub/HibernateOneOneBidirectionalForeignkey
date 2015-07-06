package com.hibernateoneonebidirectionalforeinkey.app;

import java.util.Random;

import org.hibernate.Session;

import com.hibernateoneonebidirectionalforeinkey.pojo.Passport;
import com.hibernateoneonebidirectionalforeinkey.pojo.Person;
import com.hibernateoneonebidirectionalforeinkey.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		System.out.println(" ********************* Hibernate One-One Bidirectional - Foreignkey (Annotation) *** START ******************* ");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Passport passport = new Passport(new Random().nextInt(Integer.MAX_VALUE));
		Person person = new Person();
		person.setPassport(passport);
		passport.setPerson(person);
		session.save(passport);
		session.getTransaction().commit();
		session.close();
		System.out.println(" ********************* Hibernate One-One Bidirectional - Foreignkey (Annotation) *** END ********************* ");
	}

}
