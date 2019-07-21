
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>View Graph</title>
	
	<style type="text/css">
	.dropblock {
 	 background-color: #4CAF50;
 	 color: white;
 	 padding: 5px;
 	 font-size: 16px;
 	 border: none;
	}

	
	body{
	background: #f1f1f1;
 }
		.wrap{
			display: inline-flex;
			margin-top: 30px;
			margin-left: 390px;
		}
		.card{
			box-shadow: 0 10px 8px 0 rgba(0,0,0,0.6);
			transition: .4s ease;
			width: 350px;
			height: 350px;
			background: #fff;
			text-align: center;
			font-size: 16px;
			font-family: sans-serif;
			float: left;
			margin:10px;
			background-color:pink;
			position: relative;
		}
		.card:hover{
			box-shadow: 0 20px 30px 0 rgba(0,0,0,0.6);
		}
		.card .content{
			position: absolute;
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
		.container3 {
       		padding-top: 10px;
  			padding-bottom: 10px;
		}
		.item {
		    float:right;
		    vertical-align: top;
		}
		.img {
		    width: 60px;
		    height: 60px;
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
		.loginbtn {
		  background-color: #04B404;
		}

</style>
</head>
<header>
   
<div class="item">
</div>
</header>
<div class="head">
	<p><b>View Graph</b></p>
</div>
<div class="wrap">
    
          
	<div class="card">
		<img src="G:\minor project\2.jpg" width="350" height="400">
	      <div class="content">
             <h1>Head of Department Voting Graph</h1>
          </div>
       <form action="ViewGraphServlet" method="post">
      <div class="dropblock">
          <input type="hidden" name="command" value="hod"> 
      	<p><b>Department</b></p>
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
	    <br><br><button type="submit" class="loginbtn">Submit</button>
	  </div> 
   
     </form>
      </div> 
     
     
	<div class="card">
		<img src="G:\minor project\2.jpg" width="350" height="400">
    <div class="content">
       <h1>Student Voting Graph</h1>
    </div>
     <form action="ViewGraphServlet" method="post">
         <input type="hidden" name="command" value="student">
    <div class="dropblock">
    	<p><b>Department</b></p>
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
	    <br><br><button type="submit" class="loginbtn">Submit</button>
	  </div> 
         </form>
	</div>
     
</div>

</body>
</html>





