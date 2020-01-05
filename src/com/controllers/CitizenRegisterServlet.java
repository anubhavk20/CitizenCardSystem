package com.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.businesslogic.AdminBL;
import com.businesslogic.CitizenBL;
import com.businesslogic.CitizenBLImpl;
import com.model.Address;
import com.model.BankDetails;
import com.model.Citizen;
import com.model.Profession;
import com.model.VerificationDetails;

public class CitizenRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CitizenRegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("citizenId"));
		String name = request.getParameter("citizenName");
		String dob = request.getParameter("citizenDOB");
		String fatherName = request.getParameter("fatherName");
		String motherName = request.getParameter("motherName");
		String bloodGroup = request.getParameter("bloodGroup");
		String citizenPassword = request.getParameter("citizenPassword");
		String houseNo = request.getParameter("houseNo");
		String street = request.getParameter("street");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		String telNo = request.getParameter("telNo");
		String sectorOfProfession = request.getParameter("sectorOfProfession");
		String depttOfProfession = request.getParameter("depttOfProfession");
		String voterId = request.getParameter("voterId");
		String passportNo = request.getParameter("passportNo");
		String aadharCardNo = request.getParameter("aadharCardNo");
		String panNo = request.getParameter("panNo");
		String drivingLicenseNo = request.getParameter("drivingLicenseNo");
		String accountNo = request.getParameter("accountNo");
		String ifsc = request.getParameter("ifsc");
		String bankName = request.getParameter("bankName");
		String bankCity = request.getParameter("bankCity");
		String bankState = request.getParameter("bankState");
		
		Address address = new Address(houseNo, street, city, zip, state, telNo);
		Citizen citizen = new Citizen(id, name, dob, fatherName, motherName, bloodGroup, citizenPassword, address);
		BankDetails bankDetails = new BankDetails(accountNo, ifsc, bankName, bankCity, bankState, citizen);
		VerificationDetails verificationDetails = new VerificationDetails(voterId, passportNo, aadharCardNo, panNo, drivingLicenseNo, citizen);
		Profession profession = new Profession(sectorOfProfession, depttOfProfession, citizen);
		
		CitizenBL citizenBL = new CitizenBLImpl();
		
		boolean status = citizenBL.citizenRegisterBL(citizen, bankDetails, verificationDetails, profession);
		if(status) {
			HttpSession session = request.getSession(false);
			session.setAttribute("citizen", citizen);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("citizenHome.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
