package com.engine;

// Class for the Rover
public class MarsRover {

	private Integer N = 1;
	private Integer E = 2;
	private Integer S = 3;
	private Integer W = 4;
	private Integer x = 0;
	private Integer y = 0;
	private Integer facing = N;

	public MarsRover() {	}

	public void setPosition(Integer x, Integer y, Integer facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getFacing() {
		return facing;
	}

	public void setFacing(Integer facing) {
		this.facing = facing;
	}

	public Integer getN() {
		return this.N;
	}

	public Integer getE() {
		return this.E;
	}

	public Integer getS() {
		return this.S;
	}

	public Integer getW() {
		return this.W;
	}
}