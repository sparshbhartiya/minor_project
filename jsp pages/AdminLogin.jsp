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

<h2> Admin Login Form</h2>

<form action="Admin" method="post">
  <div class="imgcontainer">
    <img src="G:\minor project\3.jpg" alt="Avatar" class="avatar">
  </div>

  <div class="container1">
    <label for="uid"><b>User Id</b></label>
    <input type="text" placeholder="Enter UserId" name="uid" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>
  </div>

  <div class="container1" style="background-color:#f1f1f1">
    <button type="submit" class="loginbtn">Login</button>
    <button type="button" class="cancelbtn">Cancel</button>
  
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>
