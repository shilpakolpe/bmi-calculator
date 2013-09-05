<%@page import="cse.maven.sample.exception.InvalidBmiPropException"%>
<%@page import="cse.maven.sample.BmiProp"%>
<%@page import="cse.maven.sample.BmiCalculator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<h1>Bmi interpretation resutls</h1>

<h3>Result of bmi calculation is</h3>
<%
	String height = request.getParameter("height");
	String weight = request.getParameter("weight");
	
	BmiCalculator bmiCalculator = new BmiCalculator();
	
	try {
		BmiProp bmiProp = bmiCalculator.createBmiProp(height, weight);
		float bmi = bmiCalculator.calculate(bmiProp);
		out.println(bmi);
	} catch (InvalidBmiPropException ex) {
		out.println(ex.getMessage());
	}	
%>
</head>
<body>

</body>
</html>