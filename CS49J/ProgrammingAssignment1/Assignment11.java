import java.util.Scanner;

public class Assignment11 {
	public static void main(String[] args) {
		
		//Initializing variables
		int choice;															//Holds choice number as an integer type
		String first;														//Holds first string as a string type
		String second;													//Holds second string as a string type
		String firstSecond;											//Holds concatenated string as a string type
		Scanner in = new Scanner(System.in);		//Construct a method called "in" using the scanner method

		//Program introduction
		System.out.println("This program takes two separate strings");		//Program info
		System.out.println("and modifies them using the choices given.");	//Program info
		System.out.println();											                      	//Line break for reading ease
		
		//Prompts first string input
		System.out.println("Enter first string");						//Prompts user to input first string
		first = in.nextLine();												      //Hold input in variable "first"
		System.out.println("You entered string " +first);		//Feedback
		System.out.println();												        //Line break for reading ease
		
		//Prompts second string input
		System.out.println("Enter second string");						//Prompts user to input first string
		second = in.nextLine();											        	//Hold input in variable "second"
		System.out.println("You entered string " +second);		//Feedback
		System.out.println();										          		//Line break for reading ease
		
		//Gives user choices for manipulation
		System.out.println("1. Concatenate the given strings and print new length.");
		System.out.println("2. Replace any occurrence of ëeí in the first string with ëm.'");
		System.out.println("3. If found, replace 'red' with 'blue'.");
		choice = in.nextInt();
		
		//Switch block for each respective choice case
		switch (choice){
		
		//First choice enables first case
        case 1: firstSecond = first.concat(second);							//Concatenate both strings
        		int stringLength = firstSecond.length();						//Creates integer to hold length value
        		System.out.println(firstSecond + ", length: " + stringLength);  //Prints new string along with length
        		break;														//Ends program
        
        //Second choice enables second case
        case 2: System.out.println(first.replace('e', 'm'));				//Replaces e's with m's
        		break;														//Ends program
        
        //Third choice enables third case
        case 3: System.out.println(first.replace("red", "blue")); break;	//Replaces 'red' with 'blue'
        
        //If no choice is selected or invalid input
        default: System.out.println("Your input is invalid!");
        		break;
		}
	}
}
