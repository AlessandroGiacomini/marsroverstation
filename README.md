# Project: Mars Rovers - Alessandro Giacomini
-----------------------------------

## Description
-----------------------------------

### Live [here](http://marsroverstation.appspot.com/)

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.

This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.

A rover’s position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover , NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward one grid point, and maintain the same heading.

### Sample input
+ 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM 

### Sample output
+ 1 3 N 5 1 E

# Functions and features
----------------------
+ We assume that the input position Rover is inside the Plateau dimensions given as input
+ It has been managed the following case:
  once getting on the border if the Rover tries to move outside the border grid
  it is forced to remain in its current position and facing

# Technologies used
-----------------
+ Java
+ JSP
+ HTML
+ CSS
+ Google App Engine
+ Eclipse IDE