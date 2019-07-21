<%@page import="java.util.ArrayList, Pojo.ViewProfilePojo, static DaoClass.ViewProfileDao.ViewFaculty"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>candidate</title>
        <style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
   </head>
    <%
    String username= (String) session.getAttribute("username");
    if(username==null)
    {
        session.invalidate();
        response.sendRedirect("FrontPage.jsp");
    }
        String branch = (String) request.getAttribute("branch");
        ArrayList<ViewProfilePojo> stud = ViewFaculty(branch);
     %>
       
    <body>
        <h1 style="text-align: center"> Faculty's Profile</h1>
  <br> <br>
 <div>
   <table>
  <tr>
    <th>Id.</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>branch</th>
    <th>Action</th>
  </tr>
   <% for(ViewProfilePojo s: stud) {%>
  <tr>
   
    <td><%= s.getId() %></td>
    <td><%= s.getFname() %></td>
    <td><%= s.getLname()%></td>
    <td><%= branch %></td>
    <td><button>Profile</button>|<button>Update</button></td>
    <% }%>
  </tr>    
   </table>
 </div>
    </body>
</html>
