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
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() *10);
		System.out.println("Number1 is :" + number1 );
		
		int number2 = (int)(Math.random() *10);
		System.out.println("Number2 is :" + number2 );
		
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What is " + number1 + " + " + number2 + "?");
		
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			System.out.println("Answer was correct");
		}else{
			System.out.println("Answer was not correct");
		}
			
		
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 2
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 3
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		// Round 4
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier

	}

}
