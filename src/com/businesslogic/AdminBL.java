package com.businesslogic;

import java.util.List;

import com.model.Citizen;

public interface AdminBL {
	public boolean adminLoginBL(int id, String password);
	public List<Citizen> viewCitizensBL();
	public void adminLogoutBL();
}
