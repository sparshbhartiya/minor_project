<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="static DaoClass.VoterRegisterDao.GetNewId" %>

<!DOCTYPE html>
<html>
<head>
<title>Voter Registration</title>
<style>
h1
{
	
	font-family: 'Indie Flower', cursive;
	font-size: 3em;
	border-bottom:2px solid pink;
	border-right: 2px solid pink;
	width:600px;
	box-shadow: 4px 4px 5px #888888;
}
* {
  box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}
input[type=date]{
width: 20%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}
input[type=email]{
width: 20%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}
input[type=password]{
width: 20%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 15%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

.drop{
	width: 20%;
	}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}
</style>
</head>
<%
    String Id=GetNewId();    
%>
<body>
<header>
<h1>Voter Registration</h1>
</header>
		
<div class="container">
    <form action="VoterRegisterServlet" method="post">
  <div class="row">
    <div class="col-25">
      <label for="fname">First Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="firstname" placeholder="Your First Name..">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="lname">Last Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="lastname" placeholder="Your last Name..">
    </div>
  </div>
 
  <div class="row">
    <div class="col-25">
      <label for="voterid">Voter Id</label>
    </div>
    <div class="col-75">
        <input type="text" id="voterid" name="voterid" value="<%= Id %>" placeholder="Voter id"  readonly="readonly">
    </div>
  </div>
    <div class="row">
    <div class="col-25">
      <label for="aadharno">Aadhar No.</label>
    </div>
    <div class="col-75">
        <input type="text" id="aadharno" name="aadharno" placeholder="Aadhar No.">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="subject">Date of Birth</label>
    </div>
    <div class="col-75">
      <input type="date" id="date" name="dob" placeholder="yyyy-mm-dd">  
    </div>
  </div>
  <div class="row">
	<div class="col-25">
	<label for="Branch">Branch</label>
	</div>
	<div class="col-75">
	<div class="drop">
		<select required name="branch">
		<option value="none" disabled>Select your Branch<br>
		<option value="cse">Computer Science</option>
                <option value="it">Information Technology</option>
                <option value="me">Mechanical</option>
                <option value="ec">Electronics and Communication</option>
                <option value="ee">Electrical Engineering</option>
                <option value="ce">Civil</option>
                <option value="cm">Chemical</option>
		</select>
		</div>
	</div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="year">Year</label>
	  </div>
	  <div class="col-75">
	  <input type="radio" required name="year" value="first" checked="checked">1st Year
	  <input type="radio" required name="year" value="second">2nd Year
	  <input type="radio" required name="year" value="third">3rd Year<br><br>
          </div>
    </div>
	<div class="row">
	<div class="col-25">
	<label for="Gender">Gender</label>
	</div>
	<div class="col-75">
	<input type="radio" required name="gender" value="Male" checked="checked">Male
	<input type="radio" required name="gender" value="Female">Female
	<input type="radio" required name="gender" value="Other">Other
	</div>
</div>
<div class="row">
	<div class="col-25">
	<label for="Voter">Voter</label>
	</div>
	<div class="col-75">
	<input type="radio" required name="votertype" value="student" checked="checked">Student
	<input type="radio" required name="votertype" value="teacher">Teacher
	</div>
</div>
<div class="row">
	<div class="col-25">
	<label for="mobile no">Mobile No.</label>
	</div>
	<div class="col-75">
            <input type="text" placeholder="Mobile Number" required name="phone" min="10">
	</div>
	</div>
	<div class="row">
	<div class="col-25">
			<label for="email">Email</label>
			</div>
			<div class="col-75">
			<input type="email" placeholder="Email" required name="email">
			</div>
			</div>
			<div class="row">
	<div class="col-25">
			<label for="password">Password</label>
			</div>
			<input type="password" placeholder="Password" required min="8" name="password">
			</div>
			
			
  
  <div class="row">
    <input type="submit" value="Submit">
  </div>
  </form>
</div>

</body>
</html>
