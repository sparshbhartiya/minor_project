<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
	<title>Admin Page</title>

<link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
	<style type="text/css">
	body{
	background-color: white;
    width:100%;
}
		.wrap{
			display: inline-flex;
			width:1000px;
			margin:auto;
			margin-top: 150px;
			margin-left: 200px;
		}
		.card{
			box-shadow: 0 10px 8px 0 rgba(0,0,0,0.6);
			transition: .4s ease;
			
			width: 200px;
			background: #fff;
			text-align: center;
			font-size: 16px;
			font-family: sans-serif;
			float: left;
			margin:10px;
			background-color:pink;
		}
		.card:hover{
			box-shadow: 0 20px 30px 0 rgba(0,0,0,0.6);
		}
		.container{
			padding: 2px 16px;
		}
		.leftbtn{
			display:inline-block;
			
			box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
			color: white;
			background-color: #66a3ff;
			margin-bottom: 3px;

		}
		.rightbtn{
			display:inline-block;
			box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
			color: white;
			background-color: #66a3ff;
			margin-bottom: 3px;
			margin-top: 2px;
		}

.item {
    float:right;
    vertical-align: top;
    
}
.img {
    width: 40px;
    height: 40px;
    
}
.logout{
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  background-color: #f44336;
}
.caption {
    margin-top:2px;
    text-align: right;
    margin-right: 14px;
    font-family: 'Advent Pro';
}
.caption:hover{
	transition: .5s;
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
%>
<body>
 Hello <%= username %>

<header>
<div class="item">
<div class="caption">
	<button type="button" class="logout" onclick="window.location.href='AdminLogout.jsp';">
        <img src="G:\minor project\logout1.png" width="80" height="25"/>
        </button>
</div>
</div>
</header>

<div class="wrap">
	<div class="card">
		<img src="G:\minor project\7.png" style="width:100%">
		<div class="container">
			<h4><b> Add Candidate</b></h4>
			<a href="StudentRegistrationPage.jsp"><button type="button" class="leftbtn">Add Student</button></a>
                        <a href="TeacherRegistrationPage.jsp"><button type="button" class="rightbtn">Add Faculty</button></a>
		</div>
	</div>

	<div class="card">
		<img src="G:\minor project\3.jpg" style="width:100%">
		<div class="container">
			<h4><b>View Candidate</b></h4>
			<a href="ViewProfilePage.jsp"><button type="button" class=leftbtn>View Candidate Profile</button></a>
    		
		</div>
	</div>
	<div class="card">
		<img src="G:\minor project\envelope.png" style="width:100%">
		<div class="container">
			<h4><b> Result</b></h4>
			<a href="ViewResultPage.jsp"><button type="button" class=leftbtn>View Result</button></a>	
		</div>
	</div>
	<div class="card">
		<img src="G:\minor project\browser.png" style="width:100%">
		<div class="container">
			<h4><b> Graph</b></h4>
			<a href="ViewGraphPage.jsp"><button type="button" class=leftbtn>View Graph</button></a>
		</div>
	</div>
	<div class="card">
		<img src="G:\minor project\ad.jpg" style="width:100%">
		<div class="container">
                    <br><h4><b> Access Database</b></h4>
    		<a href="#"><button type="button" class=rightbtn>Edit Database</button></a>

		</div>
	</div>
</div>
</body>
</html>
