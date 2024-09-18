package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
	double result;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		String opt = request.getParameter("operations");

		if (opt.equals("add")) {
			result = new Calculator().doAdd(Integer.parseInt(n1), Integer.parseInt(n2));
			String htmlRespone = "<html> <head><style>.container {\n" + "	max-width: 600px;\n"
					+ "	margin: 20px auto;\n" + "	background-color: #fff;\n" + "	padding: 20px;\n"
					+ "	border-radius: 5px;\n" + "	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" + "	\n" + "}\n" + "\n"
					+ ".result {\n" + "	color: #000000;\n" + "}</style></head>";
			htmlRespone += "<div class=\"container\"><h2 class=\"result\">Result: " + result + "</h2></div><br/>";
			htmlRespone += "</html>";
			out.println(htmlRespone);
		} else if (opt.equals("sub")) {
			result = new Calculator().doSub(Integer.parseInt(n1), Integer.parseInt(n2));
			String htmlRespone = "<html> <head><style>.container {\n" + "	max-width: 600px;\n"
					+ "	margin: 20px auto;\n" + "	background-color: #fff;\n" + "	padding: 20px;\n"
					+ "	border-radius: 5px;\n" + "	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" + "	\n" + "}\n" + "\n"
					+ ".result {\n" + "	color: #000000;\n" + "}</style></head>";
			htmlRespone += "<div class=\"container\"><h2 class=\"result\">Result: " + result + "</h2></div><br/>";
			htmlRespone += "</html>";
			out.println(htmlRespone);
		} else if (opt.equals("mul")) {
			result = new Calculator().doMul(Integer.parseInt(n1), Integer.parseInt(n2));
			String htmlRespone = "<html> <head><style>.container {\n" + "	max-width: 600px;\n"
					+ "	margin: 20px auto;\n" + "	background-color: #fff;\n" + "	padding: 20px;\n"
					+ "	border-radius: 5px;\n" + "	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" + "	\n" + "}\n" + "\n"
					+ ".result {\n" + "	color: #000000;\n" + "}</style></head>";
			htmlRespone += "<div class=\"container\"><h2 class=\"result\">Result: " + result + "</h2></div><br/>";
			htmlRespone += "</html>";
			out.println(htmlRespone);
		} else if (opt.equals("div")) {
			result = new Calculator().doDiv(Integer.parseInt(n1), Integer.parseInt(n2));
			String htmlRespone = "<html> <head><style>.container {\n" + "	max-width: 600px;\n"
					+ "	margin: 20px auto;\n" + "	background-color: #fff;\n" + "	padding: 20px;\n"
					+ "	border-radius: 5px;\n" + "	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" + "	\n" + "}\n" + "\n"
					+ ".result {\n" + "	color: #000000;\n" + "}</style></head>";
			htmlRespone += "<div class=\"container\"><h2 class=\"result\">Result: " + result + "</h2></div><br/>";
			htmlRespone += "</html>";
			out.println(htmlRespone);
		}else {
			String htmlRespone = "<html> <head><style>.container {\n" + "	max-width: 600px;\n"
					+ "	margin: 20px auto;\n" + "	background-color: #fff;\n" + "	padding: 20px;\n"
					+ "	border-radius: 5px;\n" + "	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n" + "	\n" + "}\n" + "\n"
					+ ".result {\n" + "	color: #000000;\n" + "}</style></head>";
			htmlRespone += "<div class=\"container\"><h2 >Select the valid option</h2></div><br/>";
			htmlRespone += "</html>";
			out.println(htmlRespone);
		}
	}

}
