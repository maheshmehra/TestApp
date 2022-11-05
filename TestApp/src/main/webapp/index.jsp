<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.Objects.Country,java.util.List,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="GetCountryDropDown" action="post">
		<select>
			<%
				List<Country> countryList = (ArrayList<Country>)request.getAttribute("countyList");
				if(countryList != null)
				{
				for(Country country : countryList)
				{%>
					<option value="<%= country.getCountryCode() %>"><%= country.getCountryName() %></option>
				<% }} %>
		</select>
	</form>
	
</body>
</html>