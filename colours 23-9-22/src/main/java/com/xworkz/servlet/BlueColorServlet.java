package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/blue")

public class BlueColorServlet extends HttpServlet {
	public BlueColorServlet() {
		System.out.println("its a default constructor");
}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.append("<html><head><body bgcolor=blue>Edu Neeli</html></head></body>");
}
}