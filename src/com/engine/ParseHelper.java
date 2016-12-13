package com.engine;

import java.util.ArrayList;

// Class to parse input data
public class ParseHelper {
	
	public ArrayList<Instruction> fromString2instructions(String s) {
		ArrayList<Instruction> allInstructions = new ArrayList<Instruction>();
		String[] arrInstructions = s.split("\\n");;
		for (String currinstr: arrInstructions) {
			String[] k = currinstr.split(" ");
			
			int x = Integer.parseInt(k[0]);
			int y = Integer.parseInt(k[1]);
			String facing = k[2].replace("\n", "").replace("\r", "");
			String instructions = k[3].replace("\n", "").replace("\r", "");
			
			Instruction p = new Instruction(x,y,facing, instructions);
			
			allInstructions.add(p);
		}
		
		return allInstructions;
	}
	
	public Integer[] fromString2Pos(String s) {
		Integer[] pos = new Integer[2];
		String[] arrInteger = s.split(" ");
		
		pos[0] = new Integer(arrInteger[0].replaceAll("\\p{Z}",""));
		pos[1] = new Integer(arrInteger[1].replaceAll("\\p{Z}",""));
	    
		return pos;
	}
}
