package com.engine;

// Class helper for Mars Rover actions
public class MarsRoverHelper {

	public MarsRoverHelper() {}

	// The current rover executes the instructions received on the grid
	public String run(MarsRover rover, Instruction i, Plateau p) {

		String face = i.getFacing();
		String instr = i.getInstructions();
		
		if (face.equals("N")) {
			rover.setPosition(i.getX(), i.getY(), rover.getN());
		} else if (face.equals("E")) {
			rover.setPosition(i.getX(), i.getY(), rover.getE());
		} else if (face.equals("S")) {
			rover.setPosition(i.getX(), i.getY(), rover.getS());
		} else if (face.equals("W")) {
			rover.setPosition(i.getX(), i.getY(), rover.getW());
		}

		computeInstructions(rover, instr, p);			

		return printPosition(rover);
	}

	// Process all instructions commands
	public void computeInstructions(MarsRover rover, String commands, Plateau p) {
		for (int idx = 0; idx < commands.length(); idx++ ) {
			Character c = commands.charAt(idx);
			if (c.equals('L')) {
				turnLeft(rover);
			} else if (c.equals('R')) {
				turnRight(rover);
			} else if (c.equals('M')) {
				move(rover, p);
			}
		}
	}
	
	// Rotation right facing 
	public void turnRight(MarsRover rover) {
		Integer facing = rover.getFacing();
		if (!((facing + 1) > 4))
			rover.setFacing(facing + 1);	
		else
			rover.setFacing(1);		
	}
	
	// Rotation left facing 
	public void turnLeft(MarsRover rover) {
		Integer facing = rover.getFacing();
		if (!((facing - 1) < 1))
			rover.setFacing(facing - 1);		
		else
			rover.setFacing(4);		
	}

	// Move forward one grid point, and maintain the same facing 
	public void move(MarsRover rover, Plateau p) {
		Integer facing = rover.getFacing();
		Integer xRover = rover.getX();
		Integer yRover = rover.getY();
		Integer plateauBordx = p.getX();
		Integer plateauBordy = p.getY();

		if ((facing == 1)&&(yRover<plateauBordy)) {	
			rover.setY(yRover+1);
		} else if ((facing == 2)&&(xRover<plateauBordx)) {
			rover.setX(xRover+1);
		} else if ((facing == 3)&&(yRover>0)) {
			rover.setY(yRover-1);
		} else if ((facing == 4)&&(xRover>0)) {
			rover.setX(xRover-1);
		}
	}
	
	// Print current position
	public String printPosition(MarsRover rover) {

		String output = "";
		Integer facing = rover.getFacing();
		char orientation = 'N';
		if (facing == 1) {
			orientation = 'N';
		} else if (facing == 2) {
			orientation = 'E';
		} else if (facing == 3) {
			orientation = 'S';
		} else if (facing == 4) {
			orientation = 'W';
		}

		output = rover.getX()+" "+rover.getY()+" "+orientation;
		return output;
	}
}
