//Ahmir Roney-Watts

import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to \"Choose Your Own Adventure!\" \nIn this game you are able to weave your own tale as the story unfolds into one of 9 different endings. We encourage playing alongside friends and comparing your choices for the best and most fulfilling experience.");
		
		//Is this a cheap way to incorporate a choice? Yes. But, I made up for it with this massive library of endings.
		
		System.out.println("Do you wish to continue playing? (Type \"Yes\" \"No\"): ");
		
		String play = key.next();
		
		//Creating a variable and some branches for it.
		
		if(play.equalsIgnoreCase("Yes"))
		{
			System.out.println("Thank you for choosing to play! Now we just need to choose your character. Would you rather be a doctor, athlete, or a lawyer? (Type \"Doctor\", \"Athlete\", or \"Lawyer\"): ");
			String character = key.next();
			
			//Giving the player some options
			
			if(character.equalsIgnoreCase("Doctor"))
			{
				System.out.println("I admire your dedication to saving others. For some backstory, you came from a family in which you dealt with many hardships, with the biggest one being chronic illness. This inspired you to become a medicinal expert when you were a child. You stuck to your dreams of curing your condition and eventually graduated with your PhD at the young age of 25. With your incredible wit and determination, you took life one step further and became the head doctor/surgeon in the world's most successful hostipal. This marks the start of your game! \n\nYou hear a strange sound from behind the door as you pass by your office. Will you investigate or leave it and head to lunch? (Type \"Investigate\" or \"Relax\"): ");
				String doctorChoice1 = key.next();
				if(doctorChoice1.equalsIgnoreCase("Investigate"))
				{
					System.out.println("A curious soul, eh? \nYou swing open the door to your beautiful office and see 5 employees going through your filing cabinets and frantically taking photos of numerous private patient and employee documents. They immediately take of notice of you and stop what they\'re doing. \"What\'s going on here?\" you ask. They turn towards you in perfect sync with completely blank expressions across each of their faces, giving you just enough time to notice the bags under all of their eyes. Before you even get the chance to react, 4 of them rush you and hold you down while the 5th stands above you with an inhuman grin on his face. You let out a final scream before you awake from a deep sleep in your king-sized bed on the 3rd floor of your 6000 square-foot home, right where you fell asleep. \n\nWill you get ready for work tonight or submit the resignation letter you wrote that weekend? (Type \"Work\" or \"Resign\"): ");
					String doctorChoice2 = key.next();
					if(doctorChoice2.equalsIgnoreCase("Resign"))
					{
						
						//This ending is one of my favorites.
						
						System.out.println("You've foolishly quit your job over a nightmare and you now work at a local McDonald\'s making less than a tenth of what you did at the hospital, but hey, at least you can sleep peacefully tonight. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Minimum Wage\" ending.");
						
						System.exit(0);
					}
					else if(doctorChoice2.equalsIgnoreCase("Work"))
					{
						System.out.println("You tell yourself not to accept anymore 10+ hour surgery procedures while changing into your scrubs and coat. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Nightmares Are Normal!\" ending.");
						
						System.exit(0);
					}
				}
				else if(doctorChoice1.equalsIgnoreCase("Relax"))
				{
					System.out.println("I see you\'re all about your business. \nYou ignore the noise and keep walking until you reach the end of the corridor and enter the employee\'s lounge where all of your buddies are waiting. You greet them and grab your sandwich out of the fridge before sitting down. The sandwich is good and you have a great conversation with your friends. \nThe End! \n\nCongratulations! You\'ve unlocked the \"Food Comes First!\" ending.");
				}
					
			}
			else if(character.equalsIgnoreCase("Athlete"))
			{
				System.out.println("I admire your competitive spirit. For some backstory, you took an extreme liking to sports as a toddler and always stuck with playing some type of competitive sport throughout elementary and middle school. Your parents noticed this interest of yours and decided to take you to an NBA game. You fell in love with basketball instantly as you watched the professionals hustle up and down the court trying their hardest to outplay the other team. Since then, you\'ve turned your interest into a career and you\'re about to be drafted into the very NBA you\'ve spent the last 8 years obsessing over. All that\s left to do is choose your jersey number. It can be any number from 1 to 99. Choose wisely. This is important. (e.g \"67\")");
				
				int jerseyNumber = key.nextInt();
				
				if(jerseyNumber > 0 && jerseyNumber < 30)
				{
					System.out.println("You chose a low number, and therefore you will go on to become the best basketball player to ever live, winning a championship with 8 different teams over a 15-year career in the NBA before retiring with millions of dollars to your name in assets. You've chosen well and will go down in history as the one true greatest of all-time in the basketball world! \nThe end! \n\nCongratulations! You\'ve unlocked the \"G.O.A.T.\" ending.");
					System.exit(0);
					
				}
				else if(jerseyNumber > 29 && jerseyNumber < 77)
				{
					System.out.println("You chose a middle number for the back of your jersey. Your career was average at best. You didn't win a championship. Your stats were okay. You were ultimately forgettable and only lasted 6 years in the league. You have a few million dollars in assets and made just enough money from the NBA to fund a modest lifestyle. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What Number Was He Again?\" ending.");
					System.exit(0);
					
				}
				else if(jerseyNumber > 76 && jerseyNumber < 100)
				{
					System.out.println("You chose a high jersey number, meaning you ended up being the number one pick in your draft class. However, you also went on to become objectively one of the worst basketball players to ever graze an NBA court and single-handedly dragged your team to the bottom of the league. This gave you the reputation \"Basketball\'s Biggest Disappointment\" and you became the most hated player in the league, even being banned from the city you were drafted to. How depressing. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Most Hated\" ending.");
					System.exit(0);
					
				}
			}
			else if(character.equalsIgnoreCase("Lawyer"))
			{
				System.out.println("I sense that you like to argue with others. Interesting. For some backstory, you have always been a difficult child. Taking care of you was often compared to overly grueling and painful tasks like getting a paper cut, burning one\'s arm on a hot surface, being attacked and chased by numerous dogs, and even losing something important after thinking you had just left it in a certain spot. Once you started high school, you began writing as a way to pass the time and particularly enjoyed whipping up argumentative essays on very polarizing topics which obviously made you, as you loved to say, \"fun\" at parties. Despite your tendency to bring down the mood by talking about politics, the thought of going to college and becoming a lawyer was exciting to you. Something about \"getting paid to argue with grown men and women on behalf of other grown men and women\" truly made you happy. This passion of yours carried you all the way into your 30th year at a law firm with retirement just around the corner. You\'ve never lost a case in all your years and soon that record would be immortalized across the United States. All you have to do is decide whether or not you want to win one more time. A case file hits your desk containing an open-and-shut case for a man being charged with capital murder. You have a 0.5% chance of winning this case. Will you take one last job and risk it all or safely coast to your long-awaited retirement? (Type \"Risk\" or \"Retire\"): ");
				
				String lawyerChoice = key.next();
				if(lawyerChoice.equalsIgnoreCase("Risk"))
				{
					System.out.println("\"Never tell me the odds!\" you exclaim as you choose to accept the case. Three months pass and the fighting is done. You did all you could and it meant absolutely nothing. The court date came and the trial lasted a record 7 minutes. Your client was sentenced to life and your record is now stained. You lost your streak. You lost your fame. You even lost the respect of many of your peers. You still had an amazing career with an incredible record of 154 cases won to just 1 loss (and quite a stupid one, at that). You retire tomorrow and will comfortably live the rest of your life wondering what could\'ve been had you just chosen to retire and passed that case to the person behind you. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What If...\" ending.");
					System.exit(0);
				}
				else if(lawyerChoice.equalsIgnoreCase("Retire"))
				{
					System.out.println("\"Not today\" you say to yourself as you slide the case to the person behind you. Three months pass and the fighting is done. You did your absolute best for over 30 years and you never failed even once. Your clients, peers, and admirers have spoken. You have taken life by the horns and done what no other person could in the court of law. You had a truly stellar career with an unbeatable record of 154 cases won and not a single loss. You retire tomorrow and will comfortably live the rest of your life at peace with all of accolades and accomplishments on display across the country in every single courtroom. As a bonus, you also now have legal immunity to all petty crimes as well as the key to Olympia, the capital of Washington. Your career is technically over, but your impact and legacy will live on forever, taught to future generations of lawyers to come. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Better Safe Than Sorry\" ending.");
					System.exit(0);
				}
			}
		}
		else if(play.equalsIgnoreCase("No"))
		{
			
			System.out.println("You really don\'t want to play this game? (Type \"Yes\" or \"No\": ");
			play = key.next();
			if(play.equalsIgnoreCase("No"))
			{

				System.out.println("That was funny, but seriously, please pick yes so you can start the game. (Type \"Yes\" or \"No\"): ");
				play = key.next();
				if(play.equalsIgnoreCase("No"))
				{
					System.out.println("Why open a game you do not wish to play? \nWhat's your problem with me? Was it something I said? \nWell, regardless of your reasons, your decision remains. \nHopefully you make better choices next time. \n \n \nCongratulations! You've unlocked the \"Seriously?\" ending.");
					
					System.exit(0);
				}
				else if(play.equalsIgnoreCase("Yes"))
				{
					System.out.println("Thank you for choosing to play! Now we just need to choose your character. Would you rather be a doctor, athlete, or a lawyer? (Type \"Doctor\", \"Athlete\", or \"Lawyer\"): ");
					String character = key.next();
					if(character.equalsIgnoreCase("Doctor"))
					{
						System.out.println("I admire your dedication to saving others. For some backstory, you came from a family in which you dealt with many hardships, with the biggest one being chronic illness. This inspired you to become a medicinal expert when you were a child. You stuck to your dreams of curing your condition and eventually graduated with your PhD at the young age of 25. With your incredible wit and determination, you took life one step further and became the head doctor/surgeon in the world's most successful hostipal. This marks the start of your game! \n\nYou hear a strange sound from behind the door as you pass by your office. Will you investigate or leave it and head to lunch? (Type \"Investigate\" or \"Relax\"): ");
						String doctorChoice1 = key.next();
						if(doctorChoice1.equalsIgnoreCase("Investigate"))
						{
							System.out.println("A curious soul, eh? \nYou swing open the door to your beautiful office and see 5 employees going through your filing cabinets and frantically taking photos of numerous private patient and employee documents. They immediately take of notice of you and stop what they\'re doing. \"What\'s going on here?\" you ask. They turn towards you in perfect sync with completely blank expressions across each of their faces, giving you just enough time to notice the bags under all of their eyes. Before you even get the chance to react, 4 of them rush you and hold you down while the 5th stands above you with an inhuman grin on his face. You let out a final scream before you awake from a deep sleep in your king-sized bed on the 3rd floor of your 6000 square-foot home, right where you fell asleep. \n\nWill you get ready for work tonight or submit the resignation letter you wrote that weekend? (Type \"Work\" or \"Resign\"): ");
							String doctorChoice2 = key.next();
							if(doctorChoice2.equalsIgnoreCase("Resign"))
							{
								System.out.println("You've foolishly quit your job over a nightmare and you now work at a local McDonald\'s making less than a tenth of what you did at the hospital, but hey, at least you can sleep peacefully tonight. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Minimum Wage\" ending.");
								
								System.exit(0);
							}
							else if(doctorChoice2.equalsIgnoreCase("Work"))
							{
								System.out.println("You tell yourself not to accept anymore 10+ hour surgery procedures while changing into your scrubs and coat. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Nightmares Are Normal!\" ending.");
								
								System.exit(0);
							}
						}
						else if(doctorChoice1.equalsIgnoreCase("Relax"))
						{
							System.out.println("I see you\'re all about your business. \nYou ignore the noise and keep walking until you reach the end of the corridor and enter the employee\'s lounge where all of your buddies are waiting. You greet them and grab your sandwich out of the fridge before sitting down. The sandwich is good and you have a great conversation with your friends. \nThe End! \n\nCongratulations! You\'ve unlocked the \"Food Comes First!\" ending.");
						}
							
					}
					else if(character.equalsIgnoreCase("Athlete"))
					{
						System.out.println("I admire your competitive spirit. For some backstory, you took an extreme liking to sports as a toddler and always stuck with playing some type of competitive sport throughout elementary and middle school. Your parents noticed this interest of yours and decided to take you to an NBA game. You fell in love with basketball instantly as you watched the professionals hustle up and down the court trying their hardest to outplay the other team. Since then, you\'ve turned your interest into a career and you\'re about to be drafted into the very NBA you\'ve spent the last 8 years obsessing over. All that\s left to do is choose your jersey number. It can be any number from 1 to 99. Choose wisely. This is important. (e.g \"67\")");
						
						int jerseyNumber = key.nextInt();
						
						if(jerseyNumber > 0 && jerseyNumber < 30)
						{
							System.out.println("You chose a low number, and therefore you will go on to become the best basketball player to ever live, winning a championship with 8 different teams over a 15-year career in the NBA before retiring with millions of dollars to your name in assets. You've chosen well and will go down in history as the one true greatest of all-time in the basketball world! \nThe end! \n\nCongratulations! You\'ve unlocked the \"G.O.A.T.\" ending.");
							System.exit(0);
							
						}
						else if(jerseyNumber > 29 && jerseyNumber < 77)
						{
							System.out.println("You chose a middle number for the back of your jersey. Your career was average at best. You didn't win a championship. Your stats were okay. You were ultimately forgettable and only lasted 6 years in the league. You have a few million dollars in assets and made just enough money from the NBA to fund a modest lifestyle. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What Number Was He Again?\" ending.");
							System.exit(0);
							
						}
						else if(jerseyNumber > 76 && jerseyNumber < 100)
						{
							System.out.println("You chose a high jersey number, meaning you ended up being the number one pick in your draft class. However, you also went on to become objectively one of the worst basketball players to ever graze an NBA court and single-handedly dragged your team to the bottom of the league. This gave you the reputation \"Basketball\'s Biggest Disappointment\" and you became the most hated player in the league, even being banned from the city you were drafted to. How depressing. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Most Hated\" ending.");
							System.exit(0);
							
						}
					}
					else if(character.equalsIgnoreCase("Lawyer"))
					{
						System.out.println("I sense that you like to argue with others. Interesting. For some backstory, you have always been a difficult child. Taking care of you was often compared to overly grueling and painful tasks like getting a paper cut, burning one\'s arm on a hot surface, being attacked and chased by numerous dogs, and even losing something important after thinking you had just left it in a certain spot. Once you started high school, you began writing as a way to pass the time and particularly enjoyed whipping up argumentative essays on very polarizing topics which obviously made you, as you loved to say, \"fun\" at parties. Despite your tendency to bring down the mood by talking about politics, the thought of going to college and becoming a lawyer was exciting to you. Something about \"getting paid to argue with grown men and women on behalf of other grown men and women\" truly made you happy. This passion of yours carried you all the way into your 30th year at a law firm with retirement just around the corner. You\'ve never lost a case in all your years and soon that record would be immortalized across the United States. All you have to do is decide whether or not you want to win one more time. A case file hits your desk containing an open-and-shut case for a man being charged with capital murder. You have a 0.5% chance of winning this case. Will you take one last job and risk it all or safely coast to your long-awaited retirement? (Type \"Risk\" or \"Retire\"): ");
						
						String lawyerChoice = key.next();
						if(lawyerChoice.equalsIgnoreCase("Risk"))
						{
							System.out.println("\"Never tell me the odds!\" you exclaim as you choose to accept the case. Three months pass and the fighting is done. You did all you could and it meant absolutely nothing. The court date came and the trial lasted a record 7 minutes. Your client was sentenced to life and your record is now stained. You lost your streak. You lost your fame. You even lost the respect of many of your peers. You still had an amazing career with an incredible record of 154 cases won to just 1 loss (and quite a stupid one, at that). You retire tomorrow and will comfortably live the rest of your life wondering what could\'ve been had you just chosen to retire and passed that case to the person behind you. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What If...\" ending.");
							System.exit(0);
						}
						else if(lawyerChoice.equalsIgnoreCase("Retire"))
						{
							System.out.println("\"Not today\" you say to yourself as you slide the case to the person behind you. Three months pass and the fighting is done. You did your absolute best for over 30 years and you never failed even once. Your clients, peers, and admirers have spoken. You have taken life by the horns and done what no other person could in the court of law. You had a truly stellar career with an unbeatable record of 154 cases won and not a single loss. You retire tomorrow and will comfortably live the rest of your life at peace with all of accolades and accomplishments on display across the country in every single courtroom. As a bonus, you also now have legal immunity to all petty crimes as well as the key to Olympia, the capital of Washington. Your career is technically over, but your impact and legacy will live on forever, taught to future generations of lawyers to come. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Better Safe Than Sorry\" ending.");
							System.exit(0);
						}
					}
				}
			}
			else if(play.equalsIgnoreCase("Yes"))
			{
				System.out.println("Thank you for choosing to play! Now we just need to choose your character. Would you rather be a doctor, athlete, or a lawyer? (Type \"Doctor\", \"Athlete\", or \"Lawyer\"): ");
				String character = key.next();
				if(character.equalsIgnoreCase("Doctor"))
				{
					System.out.println("I admire your dedication to saving others. For some backstory, you came from a family in which you dealt with many hardships, with the biggest one being chronic illness. This inspired you to become a medicinal expert when you were a child. You stuck to your dreams of curing your condition and eventually graduated with your PhD at the young age of 25. With your incredible wit and determination, you took life one step further and became the head doctor/surgeon in the world's most successful hostipal. This marks the start of your game! \n\nYou hear a strange sound from behind the door as you pass by your office. Will you investigate or leave it and head to lunch? (Type \"Investigate\" or \"Relax\"): ");
					String doctorChoice1 = key.next();
					if(doctorChoice1.equalsIgnoreCase("Investigate"))
					{
						System.out.println("A curious soul, eh? \nYou swing open the door to your beautiful office and see 5 employees going through your filing cabinets and frantically taking photos of numerous private patient and employee documents. They immediately take of notice of you and stop what they\'re doing. \"What\'s going on here?\" you ask. They turn towards you in perfect sync with completely blank expressions across each of their faces, giving you just enough time to notice the bags under all of their eyes. Before you even get the chance to react, 4 of them rush you and hold you down while the 5th stands above you with an inhuman grin on his face. You let out a final scream before you awake from a deep sleep in your king-sized bed on the 3rd floor of your 6000 square-foot home, right where you fell asleep. \n\nWill you get ready for work tonight or submit the resignation letter you wrote that weekend? (Type \"Work\" or \"Resign\"): ");
						String doctorChoice2 = key.next();
						if(doctorChoice2.equalsIgnoreCase("Resign"))
						{
							System.out.println("You've foolishly quit your job over a nightmare and you now work at a local McDonald\'s making less than a tenth of what you did at the hospital, but hey, at least you can sleep peacefully tonight. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Minimum Wage\" ending.");
							
							System.exit(0);
						}
						else if(doctorChoice2.equalsIgnoreCase("Work"))
						{
							System.out.println("You tell yourself not to accept anymore 10+ hour surgery procedures while changing into your scrubs and coat. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Nightmares Are Normal!\" ending.");
							
							System.exit(0);
						}
					}
					else if(doctorChoice1.equalsIgnoreCase("Relax"))
					{
						System.out.println("I see you\'re all about your business. \nYou ignore the noise and keep walking until you reach the end of the corridor and enter the employee\'s lounge where all of your buddies are waiting. You greet them and grab your sandwich out of the fridge before sitting down. The sandwich is good and you have a great conversation with your friends. \nThe End! \n\nCongratulations! You\'ve unlocked the \"Food Comes First!\" ending.");
					}
						
				}
				else if(character.equalsIgnoreCase("Athlete"))
				{
					System.out.println("I admire your competitive spirit. For some backstory, you took an extreme liking to sports as a toddler and always stuck with playing some type of competitive sport throughout elementary and middle school. Your parents noticed this interest of yours and decided to take you to an NBA game. You fell in love with basketball instantly as you watched the professionals hustle up and down the court trying their hardest to outplay the other team. Since then, you\'ve turned your interest into a career and you\'re about to be drafted into the very NBA you\'ve spent the last 8 years obsessing over. All that\s left to do is choose your jersey number. It can be any number from 1 to 99. Choose wisely. This is important. (e.g \"67\")");
					
					int jerseyNumber = key.nextInt();
					
					//This is both the numerical comparison and boolean compound branch
					
					if(jerseyNumber > 0 && jerseyNumber < 30)
					{
						System.out.println("You chose a low number, and therefore you will go on to become the best basketball player to ever live, winning a championship with 8 different teams over a 15-year career in the NBA before retiring with millions of dollars to your name in assets. You've chosen well and will go down in history as the one true greatest of all-time in the basketball world! \nThe end! \n\nCongratulations! You\'ve unlocked the \"G.O.A.T.\" ending.");
						System.exit(0);
						
					}
					else if(jerseyNumber > 29 && jerseyNumber < 77)
					{
						System.out.println("You chose a middle number for the back of your jersey. Your career was average at best. You didn't win a championship. Your stats were okay. You were ultimately forgettable and only lasted 6 years in the league. You have a few million dollars in assets and made just enough money from the NBA to fund a modest lifestyle. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What Number Was He Again?\" ending.");
						System.exit(0);
						
					}
					//Lots of options to make sure it's entertaining
					else if(jerseyNumber > 76 && jerseyNumber < 100)
					{
						System.out.println("You chose a high jersey number, meaning you ended up being the number one pick in your draft class. However, you also went on to become objectively one of the worst basketball players to ever graze an NBA court and single-handedly dragged your team to the bottom of the league. This gave you the reputation \"Basketball\'s Biggest Disappointment\" and you became the most hated player in the league, even being banned from the city you were drafted to. How depressing. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Most Hated\" ending.");
						System.exit(0);
						
					}
				}
				else if(character.equalsIgnoreCase("Lawyer"))
				{
					System.out.println("I sense that you like to argue with others. Interesting. For some backstory, you have always been a difficult child. Taking care of you was often compared to overly grueling and painful tasks like getting a paper cut, burning one\'s arm on a hot surface, being attacked and chased by numerous dogs, and even losing something important after thinking you had just left it in a certain spot. Once you started high school, you began writing as a way to pass the time and particularly enjoyed whipping up argumentative essays on very polarizing topics which obviously made you, as you loved to say, \"fun\" at parties. Despite your tendency to bring down the mood by talking about politics, the thought of going to college and becoming a lawyer was exciting to you. Something about \"getting paid to argue with grown men and women on behalf of other grown men and women\" truly made you happy. This passion of yours carried you all the way into your 30th year at a law firm with retirement just around the corner. You\'ve never lost a case in all your years and soon that record would be immortalized across the United States. All you have to do is decide whether or not you want to win one more time. A case file hits your desk containing an open-and-shut case for a man being charged with capital murder. You have a 0.5% chance of winning this case. Will you take one last job and risk it all or safely coast to your long-awaited retirement? (Type \"Risk\" or \"Retire\"): ");
					
					String lawyerChoice = key.next();
					if(lawyerChoice.equalsIgnoreCase("Risk"))
					{
						System.out.println("\"Never tell me the odds!\" you exclaim as you choose to accept the case. Three months pass and the fighting is done. You did all you could and it meant absolutely nothing. The court date came and the trial lasted a record 7 minutes. Your client was sentenced to life and your record is now stained. You lost your streak. You lost your fame. You even lost the respect of many of your peers. You still had an amazing career with an incredible record of 154 cases won to just 1 loss (and quite a stupid one, at that). You retire tomorrow and will comfortably live the rest of your life wondering what could\'ve been had you just chosen to retire and passed that case to the person behind you. \nThe end! \n\nCongratulations! You\'ve unlocked the \"What If...\" ending.");
						System.exit(0);
					}
					else if(lawyerChoice.equalsIgnoreCase("Retire"))
					{
						System.out.println("\"Not today\" you say to yourself as you slide the case to the person behind you. Three months pass and the fighting is done. You did your absolute best for over 30 years and you never failed even once. Your clients, peers, and admirers have spoken. You have taken life by the horns and done what no other person could in the court of law. You had a truly stellar career with an unbeatable record of 154 cases won and not a single loss. You retire tomorrow and will comfortably live the rest of your life at peace with all of accolades and accomplishments on display across the country in every single courtroom. As a bonus, you also now have legal immunity to all petty crimes as well as the key to Olympia, the capital of Washington. Your career is technically over, but your impact and legacy will live on forever, taught to future generations of lawyers to come. \nThe end! \n\nCongratulations! You\'ve unlocked the \"Better Safe Than Sorry\" ending.");
						
						//I have to make sure the program stops every time the story ends.
						
						System.exit(0);
					}
				}
			}
			
			
		}
		

	}

}
