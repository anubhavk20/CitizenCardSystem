package com.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.businesslogic.AdminBL;
import com.businesslogic.AdmminBLImpl;
import com.model.Citizen;

public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public AdminLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminId = Integer.parseInt(request.getParameter("adminId"));
		String password = request.getParameter("adminPassword");
		AdminBL adminBl = new AdmminBLImpl();
		boolean status = adminBl.adminLoginBL(adminId, password);
		List<Citizen> citizens = adminBl.viewCitizensBL();
		if(status==true) {
			HttpSession session = request.getSession(false);
			session.setAttribute("citizens", citizens);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminHome.jsp");
			requestDispatcher.forward(request, response);
			
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("adminLogin.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
