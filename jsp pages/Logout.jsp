<%-- 
    Document   : Logout
    Created on : Mar 7, 2019, 7:14:12 PM
    Author     : saura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <style>
        input[type=submit] {
        background-color: #4CAF50;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        float: right ;
        }

        input[type=submit]:hover {
         background-color: #45a049;
        }
    </style>
    <body>
        <% 
            session.invalidate();
        %>
        <h1 style="text-align: center">Thank You For Your Voting.</h1>
         <form action="" method="">
             <div>
          <label for="q1">feedback question no 1</label>
	  <input type="radio" required name="q1" value="5" checked="checked">5
	  <input type="radio" required name="q1" value="4">4
	  <input type="radio" required name="q1" value="3">3
          <input type="radio" required name="q1" value="2">2
	  <input type="radio" required name="q1" value="1">1<br><br>
             </div>
             <div>
          <label for="q2">feedback question no 2</label>
	  <input type="radio" required name="q2" value="5" checked="checked">5
	  <input type="radio" required name="q2" value="4">4
	  <input type="radio" required name="q2" value="3">3
          <input type="radio" required name="q2" value="2">2
	  <input type="radio" required name="q2" value="1">1<br><br>
             </div>
             <div>
          <label for="q3">feedback question no 3</label>
       	  <input type="radio" required name="q3" value="5" checked="checked">5
	  <input type="radio" required name="q3" value="4">4
	  <input type="radio" required name="q3" value="3">3
          <input type="radio" required name="q3" value="2">2
	  <input type="radio" required name="q3" value="1">1<br><br>
          </div>
             <div>
          <label for="q4">feedback question no 4</label>
      	  <input type="radio" required name="q4" value="5" checked="checked">5
	  <input type="radio" required name="q4" value="4">4
	  <input type="radio" required name="q4" value="3">3
          <input type="radio" required name="q4" value="2">2
	  <input type="radio" required name="q4" value="1">1<br><br>          
             </div>
             <div>
          <label for="q5">feedback question no 5</label>
     	  <input type="radio" required name="q5" value="5" checked="checked">5
	  <input type="radio" required name="q5" value="4">4
	  <input type="radio" required name="q5" value="3">3
          <input type="radio" required name="q5" value="2">2
	  <input type="radio" required name="q5" value="1">1<br><br>
             </div>
             <div class="row">
             <input type="submit" value="Submit" onclick="window.location.href='FrontPage.jsp';">
             </div>
         </form>
    </body>
</html>
