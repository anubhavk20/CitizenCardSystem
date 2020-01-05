package com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.businesslogic.CitizenBL;
import com.businesslogic.CitizenBLImpl;
import com.model.Citizen;

public class CitizenLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CitizenLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int citizenId = Integer.parseInt(request.getParameter("citizenId"));
		String citizenPassword = request.getParameter("citizenPassword");
		CitizenBL citizenBl = new CitizenBLImpl();
		boolean status = citizenBl.citizenLoginBL(citizenId, citizenPassword);
		Citizen citizen = citizenBl.viewProfileBL(citizenId);
		
		if(status==true) {
			HttpSession session = request.getSession(false);
			session.setAttribute("citizen", citizen);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("citizenHome.jsp");
			requestDispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("citizenLogin.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
