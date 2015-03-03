import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment14 {
	
		static double balance = 5000;
		static double balanceNew = 0;
		static double balanceNew1 = 0;
		static double balanceNew2 = 0;
		static double balanceNew3 = 0;
		static double withdrawValue;
		static double withdrawValue1;
		static double depositValue;
		
		public static void main(String[] args) {
			//Initializing Variables
			Scanner in = new Scanner(System.in);	
			
			//Initial Balance
			System.out.println("Initial balance is: " +balance);
			
			//Deposit prompt
			System.out.println("Please input deposit amount: ");					//Prompt
			depositValue = in.nextInt();											//Hold input
			Deposit(depositValue);													//Run input through method Deposit
			System.out.println("Balance after transaction 1 is: $" +balanceNew);	//Print new balance
			System.out.println();													//Reading ease
			
			//Withdrawal
			System.out.println("Please input withdrawal amount: ");					//Prompt
			withdrawValue = in.nextInt();											//Hold input
			Withdraw(withdrawValue);												//Run input through method Withdraw
			System.out.println("Balance after transaction 2 is: $" +balance);		//Print new balance
			System.out.println();													//Reading ease
			
			//20 withdrawals
			System.out.println("We will now do 20 separate withdrawals.");			//Prompt
			System.out.println("Please input withdrawal amount: ");					//Prompt
			withdrawValue1 = in.nextInt();											//Hold input
			Withdraw20(withdrawValue1);												//Run input through method Withdraw20
			System.out.println("Balance after transaction 3 is: $" +balanceNew1);	//Print new balance
			System.out.println();													//Reading ease
			
			//2nd Deposit
			System.out.println("Please input deposit amount: ");					//Prompt
			depositValue = in.nextInt();											//Hold input
			secondDeposit(depositValue);											//Run input through method secondDeposit
			System.out.println("Balance after transaction 4 is: $" +balanceNew);	//Print new balance
			System.out.println();													//Reading ease
			
			Interest(balanceNew);
			System.out.println("Balance after transaction 5 is: $" + balanceNew2);
			System.out.println();
			
			System.out.println("We will now do 100 separate deposits.");
			System.out.println("Please input deposit amount: ");
			depositValue = in.nextInt();
			thirdDeposit(depositValue);
			System.out.println("Balance after transaction 6 is: $" +balanceNew3);
			System.out.println();
	}

private static void Withdraw(double withdrawValue) {
	if(withdrawValue<balance) {
		balance = balanceNew - withdrawValue;
		}
	else {
		balance = balanceNew - withdrawValue;
		}
	}
private static void Deposit(double depositValue) {
	if(depositValue>10000) {
		balanceNew = balance + depositValue + 500;
		}
	else {
		balanceNew = balance + depositValue;
		}
	}
private static void Withdraw20(double withdrawValue1) {
		balanceNew1 = (balance - (withdrawValue1 * 20));
	}
private static void secondDeposit(double depositValue) {
	if(depositValue>10000) {
		balanceNew = balanceNew1 + depositValue + 500;
		}
	else {
		balanceNew = balanceNew1 + depositValue;
		}
	}
private static void Interest(double balanceNew) {
	if(balanceNew > 5000) {
		balanceNew2 = balanceNew * 1.03;
		}
	else {
		balanceNew2 = balanceNew * 1.02;
		}
	}
private static void thirdDeposit(double depositValue) {
	if(depositValue>10000) {
		balanceNew3 = balanceNew2 + (depositValue * 100) + 500;
		}
	else {
		balanceNew3 = balanceNew2 + (depositValue * 100);
		}
	}
}
