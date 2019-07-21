<%@page import="java.util.ArrayList, Pojo.ViewResultPojo, static DaoClass.ViewResultDao.ViewResultTeacher, static DaoClass.ViewResultDao.Voting"%>
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
        ArrayList<ViewResultPojo> t = ViewResultTeacher(branch);
        
int Voting[]= new int[3];
        Voting = Voting(branch,"hod");
     %>
       
    <body>
        <h1 style="text-align: center"> Faculty Vote Count</h1>
  <br> <br>
  <div style="text-align: center">
      <h3> Total No. of Voters: <%= Voting[0] %><br>
      Total No. of Eligible Voters: <%= Voting[1]+Voting[2] %><br>
      No. of Voted Voters: <%= Voting[2] %><br>
      No. of Non-Voted Voters: <%= Voting[1] %><br>
      <%
          float percent=0;
          if(Voting[0]!=0)
            percent= ((float)Voting[2]/Voting[0])*100;
      %>
      Voting Percentage: <%= percent%><br>
      </h3>

  </div>
 <div>
   <table>
  <tr>
    <th>Id.</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>branch</th>
    <th>Vote Count</th>
  </tr>
  <% for(ViewResultPojo s: t ) {%>
  <tr>
    <td><%= s.getId() %></td>
    <td><%= s.getFname() %></td>
    <td><%= s.getLname()%></td>
    <td><%= branch %></td>
    <td><%= s.getVcount() %></td>
    <% }%>
  </tr>    
   </table>
 </div>
    </body>
</html>
