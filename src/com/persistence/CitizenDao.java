package com.persistence;

import com.model.BankDetails;
import com.model.Citizen;
import com.model.Profession;
import com.model.VerificationDetails;

public interface CitizenDao {
	public boolean citizenRegister(Citizen citizen, BankDetails bankDetails, VerificationDetails verificationDetails, Profession profession);
	public boolean citizenLogin(int id, String password);
	public Citizen viewProfile(int id);
	public void doBankTransactions(int id);
	public void doElectricityBillPayment(int id);
	public void doRtoPayment(int id);
	public void doGasBillPayment(int id);
	public void citizenLogout();
}
