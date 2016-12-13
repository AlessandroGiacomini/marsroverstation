<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" href="bootstrap.min.css" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Orbitron" rel="stylesheet">
<title>Output</title>
</head>
<body>
	<header>
    </header>
	<article>
    	<div class="container">
        	<div class="row">
        	<br>
        	<br>
                	<h2>Output:    	
                	<h2>${requestScope['output']}
       	<br>
       	<br>
       	
                	<form action="MarsRoverServlet" method="get">
						<input class="btn btn-lg btn-primary btn-block" type="submit" value="Back to home"></input>
				</form>
        	</div>
		</div>
	</article>
	<footer>
    </footer>
</body>
</html>