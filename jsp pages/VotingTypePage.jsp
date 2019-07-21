<%-- 
    Document   : VotingTypePage
    Created on : Mar 8, 2019, 8:51:45 PM
    Author     : saura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>voting page 1</title>
        <style type="text/css">
	body{
	background: #f1f1f1;
        background-position: cover;
        }
		.wrap{
			display: inline-flex;
			margin-top: 0px;
			margin-left: 370px;
		}
		.card{
			box-shadow: 0 10px 8px 0 rgba(0,0,0,0.6);
			transition: .4s ease;
			width: 350px;
			height: 400px;
			background: #fff;
			text-align: center;
			font-size: 16px;
			font-family: sans-serif;
			float: left;
			margin:15px;
			background-color:pink;
			position: relative;
		}
		.card:hover{
			box-shadow: 0 20px 30px 0 rgba(0,0,0,0.6);
		}
		.card .content{
	;		position: absolute;
			bottom: 0;
            background: rgb(0, 0, 0); /* Fallback color */
            background: rgba(0, 0, 0, 0.5); /* Black background with 0.5 opacity */
            color: #f1f1f1;
            width: 350px;
		}
		.head{
			text-align: center;
			font-size: 35px;
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
    String[] VoterDetail= new String[5];
    VoterDetail= (String[]) request.getAttribute("VoterDetail");
%>
<body>
<div>
 Hello <%= VoterDetail[0] %> <%= VoterDetail[1] %><br>
 User Id <%= VoterDetail[4] %><br>
 Branch <%= VoterDetail[3] %><br>
 Voter Type <%= VoterDetail[2] %>
</div>
<div class="head">
	<p><b>VOTING PORTAL</b><div style="font-size: 20px"><br>Time left for Voting: 04:00:00</div></p>
</div>
        
<div class="wrap">
    <form action="VotingTypeServlet" method="post">
        <input type="hidden" name="command" value="hod">
	<div class="card">
            <input type="hidden" name="userfname" value="<%= VoterDetail[0] %>">
            <input type="hidden" name="userlname" value="<%= VoterDetail[1] %>">
            <input type="hidden" name="usertype" value="<%= VoterDetail[2] %>">
            <input type="hidden" name="branch" value="<%= VoterDetail[3] %>">
            <input type="hidden" name="userid" value="<%= VoterDetail[4] %>">
            
           <button type="submit">
            <img src="G:\minor project\2.jpg" width="350" height="400"/>
           </button>
	      <div class="content">
             <h1>Head of Department Election</h1>
             <p>Voting for HOD in particular department.</p>
              </div>
        </div>
    </form>
            
    <form action="VotingTypeServlet" method="post">
        <input type="hidden" name="command" value="student">
	<div class="card">
            <input type="hidden" name="userfname" value="<%= VoterDetail[0] %>">
            <input type="hidden" name="userlname" value="<%= VoterDetail[1] %>">
            <input type="hidden" name="usertype" value="<%= VoterDetail[2] %>">
            <input type="hidden" name="branch" value="<%= VoterDetail[3] %>">
            <input type="hidden" name="userid" value="<%= VoterDetail[4] %>">
             
             <button type="submit">
            <img src="G:\minor project\2.jpg" width="350" height="400"/>
           </button>
    <div class="content">
       <h1>Student Election</h1>
       <p>Voting for Student in particular department.</p>
    </div>
        </div>
    </form>
</div>
</body>
</html>




