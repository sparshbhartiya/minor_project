<%-- 
    Document   : VoterLoginPage
    Created on : Mar 8, 2019, 8:00:38 PM
    Author     : saura
--%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.loginbtn {
  width: 5%;
  padding: 10px 18px;
  background-color: #04B404;
}

.cancelbtn {
  width: 5%;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 4px 0 12px 0;
}

img.avatar {
  width: 10%;
  border-radius: 10%;
}

.container1 {
  padding: 16px;
}
.container2 {
  text-align: center;
}
.container3 {
  padding-top: 10px;
  padding-bottom: 10px;
}
span.psw {
  float: right;
  padding-top: 16px;
}
</style>
</head>
<body>

<h2> Voter Login Form</h2>

<form action="VoterLoginServlet" method="post">
  <div class="imgcontainer">
    <img src="G:\minor project\3.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container1">
    <label for="uid"><b>UserId</b></label>
    <input type="text" placeholder="Enter UserId" name="uid" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <div class="container3" >
    <b>Department</b>
    </div>
    <select name="Branch">
    <option value="none" disabled>Select your Branch<br>
    <option value="cse">Computer Science</option>
    <option value="it">Information Technology</option>
    <option value="me">Mechanical</option>
    <option value="ec">Electronics and Communication<br>
    <option value="ee">Electrical Engineering<br>
    <option value="ce">Civil</option>
    <option value="cm">Chemical</option>
    </select>

    <div class="container3" >
    <b>Voter Type</b>
    </div>
    <label for="teacher">teacher
      <input type="radio" name="Type" checked="checked" id="teacher" value="teacher">
    </label>
    <label for="student">student
      <input type="radio" name="Type" id="student" value="student">
    </label>
    </div>

  <div class="container1" style="background-color:#f1f1f1">
    <button type="submit" class="loginbtn">Login</button>
    <button type="button" class="cancelbtn">Cancel</button>
  
    <span class="psw">Forgot <a href="#">password?</a></span>
  <div class="container2" >
    <p>Don't have an account:-<a href="Register page">Click here to register</a>
  </div>
  </div>
</form>

</body>
</html>

