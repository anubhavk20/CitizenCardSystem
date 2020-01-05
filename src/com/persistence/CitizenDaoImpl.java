package com.persistence;

import java.io.Serializable;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helpers.DbHelper;
import com.model.BankDetails;
import com.model.Citizen;
import com.model.Profession;
import com.model.VerificationDetails;

public class CitizenDaoImpl implements CitizenDao {

	Session session;
	Transaction transaction;
	Query query;
	
	public boolean citizenRegister(Citizen citizen, BankDetails bankDetails, VerificationDetails verificationDetails, Profession profession) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();		
		Citizen citizenData = citizen;
		Serializable id1 = session.save(citizenData);
		BankDetails bankDetailsData = bankDetails;
		Serializable id2 = session.save(bankDetailsData);
		VerificationDetails verificationDetailsData = verificationDetails;
		Serializable id3 = session.save(verificationDetailsData);
		Profession professionData = profession;
		Serializable id4 = session.save(professionData);
		transaction.commit();
		
		if((!(id1==null))&&(!(id2==null))&&(!(id3==null))&&(!(id4==null))) {
			System.out.println("Registered Successfully");
			return true;
		}
		else {
			System.out.println("Could not be registered");
			return false;
		}
	}

	public boolean citizenLogin(int id, String password) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		query = session.createQuery("from Citizen  where id = :id and password = :password ");
		query.setParameter("id", id);
		query.setParameter("password", password);
		transaction.commit();
		Citizen status;
		try {
			status = (Citizen)query.getSingleResult();
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

	public Citizen viewProfile(int id) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		query = session.createQuery("from Citizen where id = :id");
		query.setParameter("id", id);
		transaction.commit();
		Citizen citizen;
		try {
			citizen = (Citizen)query.getSingleResult();
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("I am catch block");
			return null;
		}
		return citizen;
	}

	public void doBankTransactions(int id) {
		
	}

	public void doElectricityBillPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void doRtoPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void doGasBillPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void citizenLogout() {
		System.out.println("You are logged out successfully!!!");
	}

}
