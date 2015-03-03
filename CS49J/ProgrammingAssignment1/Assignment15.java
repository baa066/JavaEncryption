import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment15 {
	public static void main(String[] args){
		
		int amountArray = 0;
		int[] setArray = null;
		int i = 0;
		int amount =0;
		Scanner in = new Scanner(System.in);
		
		try {																			//Verifies if the input is valid
			//Prompts price input
			System.out.println("Please input amount of integers (has to be even):");					//Prompts user to input integer
			amountArray = in.nextInt();														//Holds input in the "Value" variable
			System.out.println();			
			}
			catch(InputMismatchException exception){
				System.out.println("Your input is invalid!");
				return;																		//If input is invalid, end program
					}	
			if (amountArray % 2 <= 0){
				setArray = new int[amountArray];
				}
			else{
				System.out.println("Your input has to be even!");
				return;
				}
			for(i = 0;i<amountArray;i++){
				System.out.println("Please input element " +(i+1) +":");
				setArray[i] = in.nextInt();
			}

			for(i=0;i < (amountArray/2);i++){
				System.out.println(setArray[i] + setArray[(amountArray - i -1)]);
 			}
		}
}
