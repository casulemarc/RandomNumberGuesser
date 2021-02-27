import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		//store low and high guess
		int highGuess = 100;
		int lowGuess = 0;
		int randNumb;
		int nextGuess = -1;		//this sentinel helps loop to continue as long response is not -1
		int count = 1;
		
		//declare constants
		final String PROGRAMMER_NAME = "Mark Kasule";
		final String DUE_DATE = "02/01/2021";
		
		//create an instance of the scanner object and store it in input
		Scanner input = new Scanner(System.in);
		
		//create an instance of RNG object and store it in randNumb
		RNG createdRNG = new RNG();
		randNumb = createdRNG.rand(100);
				
		//Welcome the user
		System.out.println("Welcome to the random Number Guess");
		
		/* Number guessed by user, this number will never be equal to the random number.
		* so we initialize it with a negative so that we are able to use the while loop
		* if that user can enter guess multiple times until answer is reached
		*/
	
		//ask user
		System.out.print("Enter your first guess: ");
		nextGuess = input.nextInt();										//store the input from user
		
		//call the input validation method
		createdRNG.inputValidation(nextGuess, lowGuess, highGuess);
		
		//ask user again
		System.out.print("Do you want to try again? ");
		String response = input.nextLine();
		
		while(response.equals("yes") || response.equals("no")) {
			//if response is yes
			if(response.equals("yes")) {
				//if response = yes
				
				//ask user
				System.out.print("Enter your first guess: ");
				nextGuess = input.nextInt();
				
				
				//call validation method again
				createdRNG.inputValidation(nextGuess, lowGuess, highGuess);
				
			}else if(response.equals("no")) {
				//if response = no print programmer's name
				System.out.println("\nThank you for using my program, Good-bye!!");
				System.out.println("Programmer's name: " + PROGRAMMER_NAME);
				System.out.println("Date: " + DUE_DATE);	
				System.exit(0); //exit the program
				
			}else {
				System.exit(0);
			}
			
			//ask user again
			System.out.print("Do you want to try again? ");
			response = input.next();
			
			//ask user
			System.out.print("Enter your first guess: ");
			nextGuess = input.nextInt();	
			
			//call validation method again
			createdRNG.inputValidation(nextGuess, lowGuess, highGuess);
			
		}
		
		//response is wrong, ask user again
		while(!(response.equals("yes")) || !(response.equals("no"))) {
			
			//System.out.println("You entered wrong response!");
			System.out.println("Please enter \"yes\" or \"no\": ");
			response = input.next();
			
			//if response is yes
			if(response.equals("yes")) {
				//if response = yes
				
				//ask user
				System.out.print("Enter your first guess: ");
				nextGuess = input.nextInt();
				
				//reset the count in RNG CLASS
				
				//call validation method again
				createdRNG.inputValidation(nextGuess, lowGuess, highGuess);
				
				
			}else if(response.equals("no")) {
				//if response = no print programmer's name
				System.out.println("\nThank you for using my program, Good-bye!!");
				System.out.println("Programmer's name: " + PROGRAMMER_NAME);
				System.out.println("Date: " + DUE_DATE);	
				System.exit(0); //exit the program
				
			}else {
				System.exit(0);
			}
			
			}//end while loop
		
		System.out.println("\nThank you for using my program, Good-bye!!");
		System.out.println("Programmer's name: " + PROGRAMMER_NAME);
		System.out.println("Date: " + DUE_DATE);	
		System.exit(0); //exit the program
	}
}

