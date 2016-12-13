<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="bootstra.min.css" type="text/css">
<link rel="stylesheet" href="style.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Orbitron" rel="stylesheet">
<title>Home Page</title>
</head>
<body>
	<header>
      <h1>Mars Rovers</h1>
    </header>
	<article>
 	<div class="container">
        	<div class="row">
              <div class="col-md-12 text-center">
                	<form action="MarsRoverServlet" method="post">
                	<p>plateauX plateauY</p>	
                		<textarea name="coordinatesPlateau" style="margin: 0px; height: 25px; width: 162px;">5 5</textarea>
                	<p>positionX positionY orientation instructions</p>
                		<textarea name="explorePlateau" style="margin: 0px; height: 70px; width: 162px;">1 2 N LMLMLMLMM
3 3 E MMRMMRMRRM
</textarea>
				<p>-please, follow the correct input format-</p>
                		<br>
                		<p></p>
                		<input class="btn btn-lg btn-primary btn-block" type="submit" value="Compute"></input>
					</form>	
              </div>
        	</div>
	</div>
	<p style="color:red;"> ${requestScope['err']}</p>
	<br>
    	<div class="container">
        	<div class="row">
              <div class="col-md-12 text-center">
				<br>
				<h4>Test Input:</h4>
				<p>
				5 5
				1 2 N LMLMLMLMM
				3 3 E MMRMMRMRRM
				<br>
				<br>
				<h4>Expected Output:</h4>				
				<p>
				1 3 N 5 1 E
				</div>			 
				<br>
				</p>
              </div>
        	</div>
	</div>    
	</article>
	<footer>
    </footer>
</body>
</html>