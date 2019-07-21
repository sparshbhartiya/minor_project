<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;

}
body{
  background-color: #cce6ff;
}
li {
  float: right;
}

li a {
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 30px;
}

li a:hover {
  background-color: #ddd;
}

h1{
  font-style: italic;
  color:#ff1a1a;
  font-weight: 500;
  font-size: 90px;
  text-align: center;
  margin-top: 0;
}


* {box-sizing:border-box}
.mySlides {display: none}
img {
  vertical-align: middle;
  max-height: 600px;
  margin-top: 12px;
}

/* Slideshow container */
.slideshow-container {
  max-width: 1300px;
  position: relative;
  margin: auto;
}

/* Next & previous buttons */
.prev, .next {
  cursor: pointer;
  position: absolute;
  top: 50%;
  width: auto;
  margin-top: -22px;
  padding: 16px;
  color: white;
  font-weight: bold;
  font-size: 18px;
  transition: 0.6s ease;
  border-radius: 0 3px 3px 0;
  user-select: none;
}

/* Position the "next button" to the right */
.next {
  right: 0;
  border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
  background-color: rgba(0,0,0,0.8);
}

/* Caption text */
.text {
  color: black;
  font-size: 15px;
  padding: 8px 12px;
  position: absolute;
  bottom: 8px;
  width: 100%;
  text-align: center;
}

/* Number text (1/3 etc) */
.numbertext {
  color: #f2f2f2;
  font-size: 12px;
  padding: 8px 12px;
  position: absolute;
  top: 0;
}

/* The dots/bullets/indicators */
.dot {
  cursor: pointer;
  height: 15px;
  width: 15px;
  margin: 0 2px;
  background-color: #bbb;
  border-radius: 50%;
  display: inline-block;
  transition: background-color 0.6s ease;
}

.active, .dot:hover {
  background-color: #717171;
}

/* Fading animation */
.fade {
  -webkit-animation-name: fade;
  -webkit-animation-duration: 1.5s;
  animation-name: fade;
  animation-duration: 1.5s;
}

@-webkit-keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

@keyframes fade {
  from {opacity: .4} 
  to {opacity: 1}
}

.box1{
  background-image:url("");
  background-size: cover;
  opacity: 0.8;
  height: 100vh;
  max-height: 700px;
  min-height: 200px;
  }
  
</style>
</head>
<body>
<div class="box1">
  <div class="box2">
<ul>
  <li><a href="AboutUs.jsp">About Us</a></li>
  <li><a href="">Candidate Profile</a></li>
  <li><a href="VoterLoginPage.jsp">Voting Page</a></li>
  <li><a href="VoterRegister.jsp">Voter Registration</a></li>
  <li><a href="AdminLogin.jsp">Admin</a></li>
</ul>
</div>

    <div>
        <marquee style="font-family:Arial; font-size:15pt; color: #ff1a1a; "scrollamount="4">
        <a href="ViewGraphPage.jsp">View Voting Result</a></marquee>
    </div> 
    
<!-- Slideshow container -->
<div class="slideshow-container">

  <!-- Full-width images with number and caption text -->
  <div class="mySlides fade">
    <div class="numbertext"><br>1 / 3</div>
    <img src="G:\minor project\5.jpg" alt="MyImage" style="width:100%">
    <div class="text"><i><h2>WELCOME ONLINE ELECTION SYSTEM</h2></i></div>
  </div>

  <div class="mySlides fade">
    
    <div class="numbertext"><br>2 / 3</div>
    <a href="VoterLoginPage.jsp"> <img src="G:\minor project\1.jpg" style="width:100%"> </a>
    <div class="text"><i><b>HOD VOTING</b></i></div>
  </div>

  <div class="mySlides fade">
    <div class="numbertext"><br>3 / 3</div>
    <a href="VoterLoginPage.jsp"><img src="G:\minor project\2.jpg"  style="width:100%"> </a>
    <div class="text"><i><b>STUDENT PRESIDENT VOTING</b></i></div>
  </div>

  <!-- Next and previous buttons -->
  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
  <a class="next" onclick="plusSlides(1)">&#10095;</a>
</div>
<br>

<!-- The dots/circles -->
<div style="text-align:center">
  <span class="dot" onclick="currentSlide(1)"></span> 
  <span class="dot" onclick="currentSlide(2)"></span> 
  <span class="dot" onclick="currentSlide(3)"></span> 
</div>
</div>
<script>
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {slideIndex = 1}    
  if (n < 1) {slideIndex = slides.length}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";  
  }
  for (i = 0; i < dots.length; i++) {
      dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
}
</script>
</body>
</html>
