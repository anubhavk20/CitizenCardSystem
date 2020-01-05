package com.businesslogic;

import com.model.BankDetails;
import com.model.Citizen;
import com.model.Profession;
import com.model.VerificationDetails;
import com.persistence.CitizenDao;
import com.persistence.CitizenDaoImpl;

public class CitizenBLImpl implements CitizenBL {
	
	CitizenDao citizenDao = new CitizenDaoImpl();

	public boolean citizenRegisterBL(Citizen citizen, BankDetails bankDetails, VerificationDetails verificationDetails, Profession profession) {
		return citizenDao.citizenRegister(citizen, bankDetails, verificationDetails, profession);
	}

	public boolean citizenLoginBL(int id, String password) {
		boolean status = citizenDao.citizenLogin(id, password);
		return status;
	}

	public Citizen viewProfileBL(int id) {
		Citizen citizen = citizenDao.viewProfile(id);
		return citizen;
	}

	public void doBankTransactionsBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doElectricityBillPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doRtoPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doGasBillPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void citizenLogoutBL() {
		// TODO Auto-generated method stub

	}

}
