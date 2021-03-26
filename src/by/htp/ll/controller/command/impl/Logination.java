package by.htp.ll.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ll.controller.command.Command;

public class Logination implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//UserLoginationInfo...
		
		System.out.println(request.getParameter("login"));
		
		boolean result = true;
		//error-redirect norm-forward
		RequestDispatcher requestDispatcher = null;
		
		
		if(result) {
			requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		}else {
			request.setAttribute("message", "wrong login or password");
			requestDispatcher = request.getRequestDispatcher("index.jsp");
			
		}
		
		requestDispatcher.forward(request, response);
	}

}
