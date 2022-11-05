package com.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Objects.Country;

/**
 * Servlet implementation class GetCountryDropDown
 */
@WebServlet("/GetCountryDropDown")
public class GetCountryDropDown extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCountryDropDown() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		countryList(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		countryList(request, response);
	}
	
	// private methods
	private void countryList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Country Drop Down
				GetCountryList countries = new GetCountryList();
				
				try
				{
					List<Country> countyList = countries.getCountryList();
					
					// setting in request
					request.setAttribute("countyList", countyList);
					
					RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		            dispatcher.include(request, response);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
	}

}
