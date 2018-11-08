package com.tuenguyen;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/message.html")
public class SendMessage extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try{
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			String msg = "GET is called";
			req.setAttribute("name", name);
			req.setAttribute("age", age);
		} catch(Exception e){
			
		}
		req.getRequestDispatcher("message.jsp").forward(req,  resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String msg = "POST is called";
		req.setAttribute("message", msg);
		try{
			String name = req.getParameter("name");
			int age = Integer.parseInt(req.getParameter("age"));
			req.setAttribute("name", name);
			req.setAttribute("age", age);
		} catch(Exception e){
			
		}
		req.getRequestDispatcher("info.jsp").forward(req, resp);
	}
}
