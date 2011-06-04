<%-- 
    Document   : loginerror
    Created on : Nov 27, 2010, 11:00:52 AM
    Author     : A.S.Malindi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p font size='4' color='red'>
            The username and password you supplied are not valid.
        </p>
        Click <a href='<%= response.encodeURL("/jsp/login.jsp")%>'>here</a>
        to retry login


</body>
</html>
