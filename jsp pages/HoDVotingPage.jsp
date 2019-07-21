<%-- 
    Document   : HoDVotingPage
    Created on : Mar 9, 2019, 1:39:28 PM
    Author     : saura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, Pojo.VotingCandDetailPojo, static DaoClass.VotingCandDetailDao.CandidateDetail" %>
<!DOCTYPE>
<html>
 <head>
   <title>HOD Voting page</title>
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
    String usertype= (String) session.getAttribute("usertype");
    if(usertype==null)
    {
        session.invalidate();
        response.sendRedirect("FrontPage.jsp");
    }
    
   session.setAttribute("H","hod");
   
   String[] VoterDetail= new String[5];
   
   VoterDetail = (String[]) request.getAttribute("VoterDetail");
  
   ArrayList<VotingCandDetailPojo> CandDetail = CandidateDetail(VoterDetail[3],"hod");
%>
<body>
<div>
 Hello- <%= VoterDetail[0] %> <%= VoterDetail[1] %><br>
 User Id- <%= VoterDetail[4] %><br>
 Branch- <%= VoterDetail[3] %><br>
 Voter Type- <%= VoterDetail[2] %>
</div>
    
  <h1 style="text-align: center"> HOD Voting Page</h1>
  <br><br><br>
 <div>
   <table>
  <tr>
    <th>Id No.</th>
    <th>Branch</th>
    <th>First Name</th>
    <th>Last Name</th>
  </tr>
 
 <% for(VotingCandDetailPojo v: CandDetail){ %>
 <tr>
     <td><%= v.getId() %></td>
     <td><%= v.getBranch() %></td>
     <td><%= v.getFname() %></td>
     <td><%= v.getLname() %></td>
     <td>
        <form action="VoteCountServlet" method="post">
            <input type="hidden" name="voterfname" value="<%= VoterDetail[0] %>">
            <input type="hidden" name="voterlname" value="<%= VoterDetail[1] %>">
            <input type="hidden" name="votertype" value="<%= VoterDetail[2] %>">
            <input type="hidden" name="voterbranch" value="<%= VoterDetail[3] %>">
            <input type="hidden" name="voterid" value="<%= VoterDetail[4] %>">
            <input type="hidden" name="candfname" value="<%= v.getFname() %>">
            <input type="hidden" name="candlname" value="<%= v.getLname() %>">
            <input type="hidden" name="candtype" value="hod">
            <input type="hidden" name="candbranch" value="<%= v.getBranch() %>">
            <input type="hidden" name="candid" value="<%= v.getId() %>">
            <button type="submit">VOTE</button>     
        </form>
     </td>
 </tr>
 <% } %>
  
</table>
 </div>
</body>
</html>

