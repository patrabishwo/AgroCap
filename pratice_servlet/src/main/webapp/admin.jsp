<%@ page  language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
    String email= request.getParameter("email");
    String password=request.getParameter("password");
    
    
    if(email.equals("admin@gmail.com") && password.equals("agrocap"))
    {
    	out.println("Login Successfully");
    	RequestDispatcher rd=request.getRequestDispatcher("ourteam1.html");
    	rd.forward(request, response);
    }else{
    	out.println("INVALID EMAIL/PASSWORD");
    	RequestDispatcher rd=request.getRequestDispatcher("welcome.html");
    	rd.include(request, response);
    }
    
%>

</body>
</html>