package com.businesslogic;

import com.model.BankDetails;
import com.model.Citizen;
import com.model.Profession;
import com.model.VerificationDetails;

public interface CitizenBL {
	public boolean citizenRegisterBL(Citizen citizen, BankDetails bankDetails, VerificationDetails verificationDetails, Profession profession);
	public boolean citizenLoginBL(int id, String password);
	public Citizen viewProfileBL(int id);
	public void doBankTransactionsBL(int id);
	public void doElectricityBillPaymentBL(int id);
	public void doRtoPaymentBL(int id);
	public void doGasBillPaymentBL(int id);
	public void citizenLogoutBL();
}
