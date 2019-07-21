<%-- 
    Document   : AdminLogout
    Created on : Mar 31, 2019, 9:21:15 PM
    Author     : saura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Logout Page</title>
    </head>
     <% 
            session.invalidate();
            response.sendRedirect("FrontPage.jsp");
     %>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
