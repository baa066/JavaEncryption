import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment13 {
		public static void main(String[] args) {
			
			//Initializing Variables
			int Value = 0;																	//Holds user's integer input
			int i = 1;																		//Incremeter placeholder
			Scanner in= new Scanner(System.in);												//Construct a method called "in" using the scanner method
			
			try {																			//Verifies if the input is valid
				//Prompts price input
				System.out.println("Please input the integer: ");							//Prompts user to input integer
				Value = in.nextInt();														//Holds input in the "Value" variable
				System.out.println();														//Line break for reading ease
				}
			catch(InputMismatchException exception){										//Verifies if input is invalid
				System.out.println("Your input is invalid!");								//Error message
				return;																		//If input is invalid, end program
				}
			while(Value>=1){																//While loop to perform iterations until less than or equal to 1
				if((Value % 2)==0){															//Modulus to determine if the number is even or odd
					Value = Value/5;														//Divide "Value" by five, set "Value" to this value
					System.out.println("Iteration " +i +": " +Value);						//Prints iteration number and value
					i++;																	//Increment "i"
					}
				else{																		//For odd numbers
					Value = (Value*3)+1;													//Multiply "Value" by 3 and add 1, set "Value" to this value
					System.out.println("Iteration " +i +": " +Value);						//Prints iteration number and value
					i++;																	//Increment "i"
					}
				}
		}
}
