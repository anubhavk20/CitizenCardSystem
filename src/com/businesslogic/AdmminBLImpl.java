package com.businesslogic;

import java.util.List;

import com.model.Citizen;
import com.persistence.AdminDao;
import com.persistence.AdminDaoImpl;

public class AdmminBLImpl implements AdminBL {

	AdminDao adminDao = new AdminDaoImpl();
	
	public boolean adminLoginBL(int id, String password) {
		boolean status = adminDao.adminLogin(id, password); 
		System.out.println("Status from BL: "+status);
		return status;
	}

	public List<Citizen> viewCitizensBL() {
		List<Citizen> citizens = adminDao.viewCitizens();
		return citizens;
	}

	public void adminLogoutBL() {
		// TODO Auto-generated method stub

	}

}
