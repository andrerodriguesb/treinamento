package br.com.treinar.controller;

	import java.io.*;
	import javax.servlet.*;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.*;
	
	@WebServlet("/OlaMundo")
	public class OlaMundo extends HttpServlet{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String message;

		public void init() throws ServletException {
			// Do required initialization
			message = "Ola Mundo Andre";
		}

		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// Set response content type
			response.setContentType("text/html");

			// Actual logic goes here.
			PrintWriter out = response.getWriter();
			out.println("<h1>" + message + "</h1>");
		}

		public void destroy() {
			// do nothing.
		}
	}
	
