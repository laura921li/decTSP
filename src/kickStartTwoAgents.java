import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import ga.GASolver;
import aStar.AStarSolver;
import utils.Combination;

public class kickStartTwoAgents {
	public static final int INFI = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner scanner;
		
		try {
			//The input file contains number of cities on the first line.
			//And one coordinate each line. 
			scanner = new Scanner(new File("input_coordinates.txt")).useDelimiter("\n");
			
			int numOfCities = Integer.parseInt(scanner.nextLine());
			String[] cityCoordinates = new String[numOfCities];
			
			for(int i = 0; i < numOfCities; i++) {
				cityCoordinates[i] = scanner.nextLine();
			}
			int[] cityIndex = new int[numOfCities];
			
			for(int i=0; i<numOfCities; i++) {
				cityIndex[i] = i;
			}
			
			//Now dividing cities among two agents.
			for(int ANumCities=1; ANumCities<=numOfCities; ANumCities++) {
				Object[] ACities = Combination.getCombinations(cityIndex, cityIndex.length, ANumCities);
				//Each element is actually of combinations. E.g., 1, 3, 6
				System.out.print(" , ");
				Object[] BCities = Combination.getCombinations(cityIndex, cityIndex.length, numOfCities - ANumCities);
				//String[] BCities = ... //The remaining, e.g. 0, 2, 4, 5, 7, if the total is [0, 1, 2, 3, 4, 5, 6, 7]
				
				System.out.println();
				
				//Now you have city indexes for A and that for B, compose the cost 2D array for each agent.
						
				//And then call the following for A once, and then for B once.
				/*AStarSolver tspSolver = new AStarSolver(cost, numOfCities, 0);
				System.out.println("Using A* Search:");
				tspSolver.printPath();
				System.out.println();
				
				GASolver tspGASolver = new GASolver(numOfCities, cost);
				System.out.println("Using Genetic Algorithm:");
				tspGASolver.printAns(3);*/
			}
				   
/*			
			
*/		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		/*
		cost[0][0] = 0; cost[0][1] = 2; cost[0][2] = 4; cost[0][3] = 9;
		cost[1][0] = 2; cost[1][1] = 0; cost[1][2] = 1; cost[1][3] = 5;
		cost[2][0] = 4; cost[2][1] = 1; cost[2][2] = 0; cost[2][3] = 6;
		cost[3][0] = 9; cost[3][1] = 5; cost[3][2] = 6; cost[3][3] = 0;
		*/
		//int visited [] = new int[numOfCities];
		//visited[1] = 2;
		
		//minSpanTree temp = new minSpanTree(cost, visited, numOfCities);
		//System.out.println(temp.getTotalCost());
		
	}

}
