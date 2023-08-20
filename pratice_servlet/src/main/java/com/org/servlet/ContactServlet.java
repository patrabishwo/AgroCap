package com.org.servlet;
import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.org.dao.ContactDao;


@WebServlet("/contact1")
public class ContactServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String contactno = req.getParameter("contactno");
		String problemfaced = req.getParameter("problem");
		System.out.println(req.getParameter("problem"));
		

		int res = ContactDao.saveContact(name, contactno, problemfaced);
		RequestDispatcher rd = req.getRequestDispatcher("index1.html");
		PrintWriter pw =resp.getWriter();
		if (res != 0) {
			pw.write("<html><body><h1>THANK YOU FOR YOUR RESPONSE!!!!!WE WILL REACH YOU BACK</h1></body></html>");
			rd.include(req, resp);
		} else {
			pw.write("<html><body><h1>SOMETHING WENT WRONG</h1></body></html>");
			rd.include(req, resp);
		}		
	}
	

}