/*Project:		Class Example of random number generator
 *Author:		Devin Smoot
 *Date: 		2015-10-05
 *Description:	A book example of rng from pg 77 
 */
import java.util.Scanner;
public class Class_Example {
	public static void main(String[] args) {
		//Set up the integers
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		
		//Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Set up for loop to begin game
		
		//Need to set up score keeping integers.
		//If score equals zero then game ends; break for loop
		//If answer is correct then add points 
		//If answer is wrong then remove points 
		
		for (int i = 0;i<4;i++){
			System.out.print("What is " + number1 + " + " + number2 + "? " );
			
			int answer = input.nextInt();
			
			System.out.println(
				number1 + " + " + number2 + " = " + 
				answer + " is " +
				(number1 +number2 == answer)
			);
		}
				
	}

}
