package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//System.out.println("How much money do you have?");
		//int startAmount = in.nextInt();
		//System.out.println("Input your win chance:");
		//double winChance = in.nextDouble();
		//double actualWinChance = Math.random();		
		int winLimit = 11;
		double expectedRuin = 0.00;
		
		//for simulation
		
		for (int totalSimulations = 0; totalSimulations <= 5 ; totalSimulations++)
		{
			System.out.println("How much money do you have?");
			int startAmount = in.nextInt();
			double winChance = Math.random();
			double actualWinChance = Math.random();	
			int playNumber = 0;
		
			
			
			if (winChance == 0.5)
			{
				 expectedRuin = 1- ((double)startAmount/(double)winLimit);
			}
			else
			{
				double alpha = (1-(double)winChance)/((double)winChance);
				 expectedRuin = (Math.pow(alpha,(double)startAmount) - Math.pow(alpha, (double)startAmount))/(1-Math.pow(alpha, (double)(winLimit)));
			}
			
		//while (winChance >= 1 || winChance <= 0)
		//{ 
			//System.out.println("Invalid input. Please input a value between 0.0-0.99");
			//System.out.println("Input your win chance:");
			//winChance = in.nextDouble();
		//}
		//System.out.println(actualWinChance);
		
		while(startAmount < winLimit && startAmount > 0)
		{
			if (actualWinChance < winChance)
				{
				startAmount++;
				playNumber++;
				
				}
			else
			{
				startAmount--;
				playNumber++;
			}
			if (startAmount == winLimit)
			{
				System.out.println("You won!");
			}
			
			else if (startAmount == 0)
			{
				System.out.println("you lose!");
			}
			else
			{
				//System.out.println(startAmount);
				//System.out.println("Input your win chance for the next round:");
				//winChance = in.nextDouble();
			}
	
			
		}
		//System.out.println("Leave!");
		System.out.println("Day number: " + totalSimulations);
		System.out.println("Number of plays that took place: " + playNumber);
		System.out.println("------------------------");
		
		}
		
		System.out.println("Expected Ruin: " + expectedRuin);
		
		
		
	}


}
