package com.test;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import com.engine.Instruction;
import com.engine.MarsRover;
import com.engine.MarsRoverHelper;
import com.engine.ParseHelper;
import com.engine.Plateau;

public class TestMarsRover {
	
	private MarsRover rover;
	private Plateau p;
	MarsRoverHelper roverHelper;
	private Integer N, E, W;
	private String input;
	
	@Before
    public void setUp() {
		rover = new MarsRover();
		roverHelper = new MarsRoverHelper();	
		N = 1; E = 2; W = 4;
		input = "1 2 N LMLMLMLMM\n3 3 E MMRMMRMRRM";

	}
	
	//Test set position of a Rover on the grid
	@Test
	public void testSetPosition() {		
		rover.setPosition(1, 2, N);
		assert(rover.getX()==1);
		assert(rover.getY()==2);
		assert(rover.getFacing()==N);
	}
	
	//Test parser string for input textarea data
	@Test
	public void testFromString2instructions() {	
		ParseHelper parser = new ParseHelper();
		List<Instruction> allInstructions = parser.fromString2instructions(input);
		assert(allInstructions.size()==2);	
		assert(allInstructions.get(0).getX()==1);
		assert(allInstructions.get(0).getY()==2);
		assert(allInstructions.get(0).getFacing().equals("N"));
		assert(allInstructions.get(0).getInstructions().equals("LMLMLMLMM"));	
		assert(allInstructions.size()==2);	
		assert(allInstructions.get(1).getX()==3);
		assert(allInstructions.get(1).getY()==3);
		assert(allInstructions.get(1).getFacing().equals("E"));
		assert(allInstructions.get(1).getInstructions().equals("MMRMMRMRRM"));	
	}
	
	//Test movement a Rover inside the grid
	@Test
	public void testMove() {
		p = new Plateau(5,5);		
		rover.setPosition(1, 2, N);
		roverHelper.move(rover, p);
		assert(rover.getX()==1);
		assert(rover.getY()==3);
		assert(rover.getFacing()==N);
	}
	
	//Test movement a Rover over the border 
	//once getting on the border if the robot tries to move outside the border grid
	//it is forced to remain in its current position
	@Test
	public void testMoveOverBorder() {
		p = new Plateau(5,5);		
		rover.setPosition(5, 5, N);
		roverHelper.move(rover, p);
		assert(rover.getX()==5);
		assert(rover.getY()==5);
		assert(rover.getFacing()==N);
	}
	
	//Test rotation right facing 
	@Test
	public void testTurnRight() {
		rover.setPosition(1, 2, N);
		roverHelper.turnRight(rover);
		assert(rover.getFacing()==E);
	}
	
	//Test rotation left facing 
	@Test
	public void testTurnLeft() {
		rover.setPosition(1, 2, N);
		roverHelper.turnLeft(rover);
		assert(rover.getFacing()==W);
	}
}
