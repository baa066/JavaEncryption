import java.util.InputMismatchException;
import java.util.Scanner;


public class Assignment12 {
	public static void main(String[] args) {
	
	//Initializing variables
	int price = 0;																	//Holds price as an integer type
	double adjustedPrice;															//Holds discounted price as integer type
	Scanner in = new Scanner(System.in);											//Construct a method called "in" using the scanner method

	
	//Program introduction
	System.out.println("This program takes the price of a car");					//Program Info
	System.out.println("then calculates and prints the discounted price.");			//Program Info
	System.out.println();															//Line break for reading ease
	
	//Input Verification
	try {																			//Verifies if the input is valid
		//Prompts price input
		System.out.println("Please input the price of the car: ");					//Prompts user to input price of car
		price = in.nextInt();														//Holds input in the price variable
		System.out.println();														//Line break for reading ease
		}
	catch(InputMismatchException exception){										//Verifies if input is invalid
		System.out.println("Your input is invalid!");								//Error message
		return;																		//If input is invalid, end program
		}																					
	
	//Process the input, calculate and output
	if(price>=15000) {																//If statement determines calculation
		adjustedPrice = price *.85;													//Calculate 15% discount if more than or equal to $15,000
		System.out.println("Actual cost of the car: $" +price);						//Print the original price
		System.out.println("Cost of the car after discount: $" +adjustedPrice); 	//Print the price with discount
		}	
	if(price>=10000&&price<15000) {													//If statement determines calculation
		adjustedPrice = price *.88;													//Calculate 12% discount if more than or equal to $10,000 and less than $15,000
		System.out.println("Actual cost of the car: $" +price);						//Print the original price
		System.out.println("Cost of the car after discount: $" +adjustedPrice); 	//Print the price with discount
		}	
	if(price<10000) {																//If statement determines calculation
		adjustedPrice = price *.93;													//Calculate 7% discount if less than $10,000
		System.out.println("Actual cost of the car: $" +price);						//Print the original price
		System.out.println("Cost of the car after discount: $" +adjustedPrice); 	//Print the price with discount
		}
	}
}
