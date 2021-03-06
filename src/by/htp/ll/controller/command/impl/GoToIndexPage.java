package by.htp.ll.controller.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.ll.bean.News;
import by.htp.ll.controller.command.Command;
import by.htp.ll.service.NewsService;
import by.htp.ll.service.ServiceException;
import by.htp.ll.service.ServiceProvider;

public class GoToIndexPage implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServiceProvider provider = ServiceProvider.getInstance();
		NewsService newsService = provider.getNewsService();
		
		try {
			List<News> news = newsService.takeAll();
			
			request.setAttribute("news", news);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
			requestDispatcher.forward(request, response);
			
		} catch (ServiceException e) {
			// TODO go to global error page
			e.printStackTrace();
		}
		
	}

}
