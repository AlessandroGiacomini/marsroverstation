package com.engine;

// Class for the instruction
public class Instruction {

	private int x;
	private int y;
	private String facing;
	private String instructions;

    public Instruction(int x, int y, String facing, String instructions) {
        this.x = x;
        this.y = y;
        this.facing = facing;
        this.instructions = instructions;
    }

    public int getX() {
    		return x;
    }
    
    public int getY() {
		return y;
    }
    
    public String getFacing() {
		return facing;
    }
    
    public String getInstructions() {
		return instructions;
    }

    	public void setX(int x) {
    		this.x = x;
    	}
    	
    	public void setY(int y) {
    		this.y = y;
    	}
    	
    	public void setFacing(String facing) {
    		this.facing = facing;
    	}
    	
    	public void setInstructions(String instructions) {
    		this.instructions = instructions;
    	}

}
