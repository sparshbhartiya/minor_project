<%@page import="ViewFaculties.ViewFacultyProfilePojo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style>
	.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 400px;
  max-height: 1000px;
  margin: auto;
  margin-top: 100px;
  text-align: center;

}

.title {
  color: grey;
  font-size: 18px;
}

button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}
span.tags 
{
    background: #1abc9c;
    border-radius: 2px;
    color: #f5f5f5;
    font-weight: bold;
    padding: 2px 4px;
    }


.card:hover{
box-shadow: 0 20px 30px 0 rgba(0,0,0,0.6);
}

button:hover, a:hover {
  opacity: 0.7;
}


</style>
</head>
<body>
    <% 
      ViewFacultyProfilePojo student = (ViewFacultyProfilePojo)request.getAttribute("Faculty_Profile");
    %>
    <a href="ViewCandidate.jsp">Go back!</a>   

<div class="card">
  <img src="data:image/jpg;base64,<%= student.getBase64Image() %>" width="50%" height="30%"/>
  <h1><%= student.getFirstName() %> <%= student.getLastName() %></h1>
  <span class="tags"><%= student.getGender() %></span>
  <span class="tags"><%= student.getFacultyID() %></span>
  <span class="tags">DOB:<%= student.getDob() %></span>
  <span class="tags">Qualification <%= student.getQualification() %></span>
  <br>
  <p><span class="tags">Bio</span>
  	<br><br>
  	<%= student.getBio() %>
  </p>
  <p><button><p>Contact</p>
  <p>Mobile no- <%=student.getMobileNo() %></p>
  <p>Email-<%= student.getEmail() %></p></button></p>
</div>

</body>
</html>