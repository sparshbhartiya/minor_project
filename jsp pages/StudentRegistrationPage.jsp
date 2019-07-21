<%@ page import="static DaoClass.StudentRegisteredDao.GetNewId" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration</title>
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
.cancelbtn {
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: left;
  background-color: #f44336;
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
    String username= (String) session.getAttribute("username");
    if(username==null)
    {
        session.invalidate();
        response.sendRedirect("FrontPage.jsp");
    }
    String Id=GetNewId();
%>
<body>
<header>
    <h1>Student Registration</h1>
    
</header>
		
<div class="container">
  <form name="frm"  action="StudentRegistrationServlet" method="post">
  <div class="row">
    <div class="col-25">
      <label for="fname">First Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="fname" name="firstname" placeholder="Your first name">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="lname">Last Name</label>
    </div>
    <div class="col-75">
      <input type="text" id="lname" name="lastname" placeholder="Your last name">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="Studentid">Student ID</label>
    </div>
    <div class="col-75">
        <input type="text" id="id" name="studentid" value="<%= Id %>" required placeholder="Student ID">
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
	<label for="Department">Department</label>
	</div>
	<div class="col-75">
	<div class="drop">
		<select required name="department">
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
  
  <div class="col-25">
	<label for="Qualification">Qualification</label>
	</div>
	<div class="col-75">
	<div class="drop">
		<select required name="qualification">
					<option value="none" disabled>Select your Qualification<br>
					<option value="BE">BE/B.Tech<br>
					<option value="ME">ME/M.Tech<br>
					<option value="PhD">PhD<br>
					<option value="MS">MS<br><br>
		</select>
		</div>
	</div>
      <div class="row">
	<div class="col-25">
      <label for="subject">Date of Joining</label>
    </div>
    <div class="col-75">
      <input type="date" id="date" name="doj" placeholder="yyyy-mm-dd">  
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
		<label for="mobile no">Mobile No.</label>
	</div>
	<div class="col-75">
			<input type="text" placeholder="Mobile Number" required name="phone">
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
                    <label for="picture">Upload Picture</label>
                    </div>
                    <input type="file" name="picture">
                    </div>
      
                    <div class="row">
                    <div class="col-25">
                    <label for="bio">Bio</label>
                    </div>
                    <textarea name="bio" rows="10" cols="20" placeholder="Write about yourself" name="bio"></textarea>
                    </div>
			
			
  
  <div class="row">
    <input type="submit" value="Submit">
    <button type="button" class="cancelbtn" onclick="window.location.href='AdminPage.jsp';">Cancel</button>
  </div>
  
  </form>
</div>

</body>
</html>