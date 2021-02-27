/**
 * This file will generate a random number between 1 and 100
 * Note that the method “rand” is a static method, so the java file does not need to be instantiated to use it.
 * Call rand with the following: RNG.rand(100) to generate a random number between 0 and 99.
 * Study this class.  
 * You will want to use four methods from this class: rand, resetCount, getCount and inputValidation.
 * 
 * @author Mark Kasule
 *
 */
import java.util.Scanner;

public class RNG {
	
	//store the random number
	private int randNumb;
	private int count = 1;
	private int reset_count = 1;
	private int nextGuess;
	private int lowGuess = 0;
	private int highGuess = 100;
	

//===============================================GET RANDOM NUMBER METHOD==================================================
	/**
	 * 
	 * @param highGuess to store maximum number
	 * @return Random Number from the math class
	 */
	public int rand(int highGuess) {
		
		//create random number	
		randNumb = (int)(Math.random() * highGuess);
		
		return randNumb;
	}

//==============================================COUNT NUMBER OF GUESS MADE================================================	
	/**
	 * gets the number of guesses
	 * @param returns nothing
	 */
	public int getCount(int count) {
		return count;
	}
	
//==============================================INPUT VALIDATION METHOD====================================================	
	
	/**
	 * Validates the data entered by the user
	 * @param nextGuess		user's next guess
	 * @param lowGuess		lowest guess less than random number
	 * @param highGuess		highest guess greater than random number
	 */
	public void inputValidation(int nextGuess, int lowGuess, int highGuess) {
		
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		if(nextGuess > randNumb) {
			
			//output guess to high
			System.out.println("Your guess is too high");
			
			//new high number
			highGuess = nextGuess;
			
			//Validate data
			
			while(nextGuess != randNumb) {
				
				//ask user
				System.out.print("Enter your next guess between "+ lowGuess + " and " + highGuess + ": ");
				nextGuess = input.nextInt();
				
				//count the number of guesses
				System.out.println("Number of guesses is: " + getCount(count++));
				
				
				
				//if guess is equal to random number
				if(nextGuess == randNumb) {
					
					//answer is correct
					System.out.println("");
					System.out.println("Yes the number is: " + randNumb);
					System.out.println("Congratulations, you guessed correctly");
									
					
				}else if(nextGuess > randNumb) { 	//if guess is higher
					
					System.out.println("Your guess is too high");
					
					//store the guess as highest number 
					highGuess = nextGuess;
					
					//space
					System.out.println("");
					
				}else {								//if guess is less
					
					
					System.out.println("Your guess is too low");
					
					//store nextguess as lowest guess 
					lowGuess = nextGuess;
					
					//space
					System.out.println("");
				}
				
			}
			//end of first while loop
	
		}else if(nextGuess < randNumb) {
			
			//store the guess
			lowGuess = nextGuess;
			
			//if its low
			System.out.println("Your guess is too low");
			

			while(nextGuess != randNumb) {
				
				//ask user
				System.out.print("Enter your next guess between "+ lowGuess + " and " + highGuess + ": ");
				nextGuess = input.nextInt();
				
				//count the number of guesses
				System.out.println("Number of guesses is: " + getCount(count++));
								
				//if guess is equal to random number
				if(nextGuess == randNumb) {
					
					//answer is correct
					System.out.println("");
					System.out.println("Yes the number is: " + randNumb);
					System.out.println("Congratulations, you guessed correctly");
					
					
				}else if(nextGuess > randNumb) { 	//if guess is higher
					
					System.out.println("Your guess is too high");
					
					//store next guess as highest guess
					highGuess = nextGuess;
					
					//store the user guess into something
					System.out.println("");
					
				}else {								//if guess is less
					
					//store next guess as lowest guess
					lowGuess = nextGuess;

					System.out.println("Your guess is too low");
					System.out.println("");
				}
				
			}
			//end of second while loop		 
			
		}	
		//end of else if statement	
		
		rand(100);
	}
	
	
//==============================================RESET COUNTED GUESS AFTER USER WANTS TO TRY AGAIN=========================
	
	/**
	 * When the user wants to try again
	 * This method resets count to the initial values
	 * so that they can guess between 0 to 100 and not from previous high and low guesses
	 * 
	 * @param count 		reset to 1
	 */
	public int resetCount(int reset_count) {

		return reset_count;  
	}
	

}

