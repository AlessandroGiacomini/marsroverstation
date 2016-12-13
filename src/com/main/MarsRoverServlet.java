package com.main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.engine.Instruction;
import com.engine.MarsRover;
import com.engine.MarsRoverHelper;
import com.engine.ParseHelper;
import com.engine.Plateau;

@SuppressWarnings("serial")
public class MarsRoverServlet extends HttpServlet {

	public MarsRoverServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		RequestDispatcher rd = null;    
		rd = request.getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		RequestDispatcher rd = null;    
		
		try {
			String stringCoordinatesPlateau = request.getParameter("coordinatesPlateau");
			String explorePlateau = request.getParameter("explorePlateau");
			ParseHelper parser = new ParseHelper();
			Integer[] coordinatesPlateau = parser.fromString2Pos(stringCoordinatesPlateau);
			Plateau p = new Plateau(coordinatesPlateau[0], coordinatesPlateau[1]);
			List<Instruction> allInstructions = parser.fromString2instructions(explorePlateau);
			List<MarsRover> allRovers = new ArrayList<MarsRover>();
			MarsRoverHelper roverHelper = new MarsRoverHelper();	
			
			String output = "";
			
			for (Instruction i: allInstructions){			
				MarsRover r = new MarsRover();
				output = output + " " + roverHelper.run(r, i, p);
				allRovers.add(r);
			}
			
			rd = request.getRequestDispatcher("/output.jsp");
			request.setAttribute("output", output);
			rd.forward(request, response);
		}
		catch (Exception exc) {
			rd = request.getRequestDispatcher("/error.jsp");
		}
	}
}
