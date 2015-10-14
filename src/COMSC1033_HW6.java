/*Project:		Addition game
 *Date:			2015-10-11
 *Author:		Devin Smoot
 *Class:		COMSC1033
 *  
 *Program notes:
 *Score: 	Wrong answer points subtraction: -1 for first round, -2 for second round, etc; increases * 2 ea round
 *			HardnessOfQuestion divided by 10 each time wrong answer given down to 10
 * 		  	Correct answer point addition: +5 for first round, +10 for second round, etc; increases +5 ea round
 * 			HardnessOfQuestion multiplied by 10 each time correct answer given
 * 		  	Answer forced into integer; No decimals accepted TRY... CATCH
 * 		  	FOR... LOOP for entire program; One round with increasing numbers each round up to 4 rounds
 * 		  	Will end if score gets to 0
 */
import java.util.Scanner;

public class COMSC1033_HW6 {
	public static void main(String[] args) {
		//Define variables
		int number1;
		int number2;
		int score = 0;
		int hardnessOfQuestion = 10;
		int studentAnswer;
		int correctAnswer;
		//State game name and rules
		System.out.println ("Let's play an addition game!");
		System.out.println ("There will be four rounds of increasing difficulty.");
		System.out.println ("If a question is answered incorrectly the difficulty will decrease.");
		
		//Set up a for loop for all four rounds
		for (int i = 0; i < 4; i++)
		{
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		//System.out.println("Number1 is :" + number1 );
		number2 = (int)(Math.random() * hardnessOfQuestion);
		//System.out.println("Number2 is :" + number2 );
		correctAnswer = number1 + number2;
		//  Ask the user to add these two numbers together
		System.out.println("\nWhat is " + number1 + " + " + number2 + "?");
		//  Read in their response
		Scanner input = new Scanner(System.in);
		//Take input and validate that input is an integer
		 do {
			 while (!input.hasNextInt()) {
		            System.out.println("That's not a number! Please enter a number.");
		            input.next(); // this is important!
		        }
		        studentAnswer = input.nextInt();
		    } while (studentAnswer <= 0);
		//  Check if the answer was correct
		//	IF correct
		if (studentAnswer == correctAnswer){
			//State that answer is correct
			System.out.println("Answer was correct");
			//Add points
			score += 2;
			//Show score
			System.out.println("Score: " + score);
			//Increase hardness of the question
			hardnessOfQuestion *= 10;
		}else{
			//State that answer is incorrect
			System.out.println("Answer was not correct");
			//Remove points
			score -= 1;
			//Show score
			System.out.println("Score: " + score);
			//Decrease hardness of the question
			hardnessOfQuestion /= 10;
		}
	}
	System.out.println ("\nThanks for playing!");
	System.out.println ("Your final score is: " + score);
	}

}
