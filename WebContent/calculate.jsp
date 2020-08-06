<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here is my title of the web</title>
</head>
<body>
 <div style="height:200px;width:200px;border-radius:200px;background-color:red;">
    
 </div>
 <hr/>
  <%  
 		int r = Integer.parseInt(request.getParameter("radius"));
		double area = 3.14*r*r;
		double circumference = 2*3.14*r;
		out.println("Area = "+area+" and Circumference = "+circumference);
		%>
</body>
</html>