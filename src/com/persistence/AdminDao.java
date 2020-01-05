package com.persistence;

import java.util.List;

import com.model.Citizen;

public interface AdminDao {
	public boolean adminLogin(int id, String password);
	public List<Citizen> viewCitizens();
	public void adminLogout();
}
