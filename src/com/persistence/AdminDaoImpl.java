package com.persistence;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.helpers.DbHelper;
import com.model.Admin;
import com.model.Citizen;

public class AdminDaoImpl implements AdminDao {

	Session session;
	org.hibernate.Transaction transaction;
	Query query;

	public boolean adminLogin(int id, String password) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		query = session.createQuery("from Admin  where id = :id and password = :password ");
		query.setParameter("id", id);
		query.setParameter("password", password);
		transaction.commit();
		Admin status;
		try {
			
			status = (Admin)query.getSingleResult();
			System.out.println(status);
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("I am catch block");
			return false;
		}
		if (!(status == null))
			return true;
		else {
			return false;
		}
	}

	public List<Citizen> viewCitizens() {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		TypedQuery<Citizen> query = session.createQuery("from Citizen", Citizen.class);
		transaction.commit();
		List<Citizen> citizens;
		try {
			citizens = (List<Citizen>)query.getResultList();
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("I am catch block");
			return null;
		}
		return citizens;
	}

	public void adminLogout() {
		System.out.println("You are logged out successfully!!!");
	}

}
