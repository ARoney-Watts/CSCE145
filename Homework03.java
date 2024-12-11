//Ahmir Roney-Watts

import java.util.Scanner;

import java.util.Random;

public class Homework03 {
	//creating a constant so we can use this for our three choices
	public static final int MAX = 3;

	public static void main(String[] args) {
		//importing a Scanner method
		Scanner key = new Scanner(System.in);
		//importing a Random method
		Random r = new Random();
		//Welcome the user
		System.out.println("Welcome to rock, paper, scissors!");
		//Declare the decision variable outside of the loop as to make sure it's a sort of constant
		String decision = ("");
		//Oh dear...the mega loop (took like an hour)
		do
		{
			//creating point tally variables
			int computerPoints = 0;
			int userPoints = 0;
			//keep the user informed and make the interface understandable
			System.out.println("The winner will be decided in three rounds, so choose carefully! \n\nRound 1 (Type \"rock\" \"paper\" or \"scissors\"):");
			
			String userChoice = key.nextLine();
			//need to create branches for each potential choice per round
			if(userChoice.equalsIgnoreCase("rock"))
			{
				//gotta have the computer choose something, right?
				int computerRandom = r.nextInt(MAX);
				//need to make branches for EVERY OUTCOME
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("You win this round!");
					userPoints++;
				}
			}
			else if(userChoice.equalsIgnoreCase("paper"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
			}
			else if(userChoice.equalsIgnoreCase("scissors"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("Neither side wins this round!");
				}
			}
			else
			{
				System.out.println("Stop messing around...That\'s a point to the computer:)");
				computerPoints++;
			}
			
			System.out.println("Round 2 (Type \"rock\" \"paper\" or \"scissors\"):");
			
			String userChoice2 = key.nextLine();
			
			if(userChoice2.equalsIgnoreCase("rock"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("You win this round!");
					userPoints++;
				}
			}
			else if(userChoice2.equalsIgnoreCase("paper"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
			}
			else if(userChoice2.equalsIgnoreCase("scissors"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("Neither side wins this round!");
				}
			}
			else
			{
				//standard input validation
				System.out.println("Stop messing around...That\'s a point to the computer:)");
				computerPoints++;
			}
			//keep the user in the loop and well-informed
			System.out.println("Round 3 A.K.A. the FINAL ROUND (Type \"rock\" \"paper\" or \"scissors\"):");
			
			String userChoice3 = key.nextLine();
			
			if(userChoice3.equalsIgnoreCase("rock"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("You win this round!");
					userPoints++;
				}
			}
			else if(userChoice3.equalsIgnoreCase("paper"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("Neither side wins this round!");
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
			}
			else if(userChoice3.equalsIgnoreCase("scissors"))
			{
				int computerRandom = r.nextInt(MAX);
				if(computerRandom == 0)
				{
					String computerChoice = ("rock");
					System.out.println("The computer chose rock.");
					System.out.println("The computer wins this round!");
					computerPoints++;
				}
				else if(computerRandom == 1)
				{
					String computerChoice = ("paper");
					System.out.println("The computer chose paper.");
					System.out.println("You win this round!");
					userPoints++;
				}
				else if(computerRandom == 2)
				{
					String computerChoice = ("scissors");
					System.out.println("The computer chose scissors.");
					System.out.println("Neither side wins this round!");
				}
			}
			else
			{
				System.out.println("Stop messing around...That\'s a point to the computer:)");
				computerPoints++;
			}
			//branches for the winner of the entire game after the points have been compared and tallied
			if(computerPoints == userPoints)
			{
				String winner = ("no one");
				System.out.println("The game is over and it looks like the "+winner+" wins this time! \n\nWould you like to play again? (Type \"yes\" or \"no\"):");
			}
			else if(computerPoints < userPoints)
			{
				String winner = ("the user");
				System.out.println("The game is over and it looks like the "+winner+" wins this time! \n\nWould you like to play again? (Type \"yes\" or \"no\"):");
			}
			else if(computerPoints > userPoints)
			{
				String winner = ("the computer");
				System.out.println("The game is over and it looks like the "+winner+" wins this time! \n\nWould you like to play again? (Type \"yes\" or \"no\"):");
			}
			//Let the user play again if they want to, in other words, if it ain't broke, don't fix it!
			decision = key.nextLine();
			
		}while(decision.equalsIgnoreCase("Yes"));
		//No means NO, so let them go
		System.exit(0);
		
		

	}
}
