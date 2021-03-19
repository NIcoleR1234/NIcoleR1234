package atm;

import java.util.Scanner;

public class MainATM {
	public static void main(String[] args) {
		Scanner kIn = new Scanner(System.in);

		ATM JohnDoe= new ATM();
		int menunum = 5;

		while (menunum != 4) {
			System.out.println("Main Menu:");
			System.out.println("1. Check balance");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. exit");
			System.out.print("Enter the appropriate number: ");
			menunum= kIn.nextInt();
			switch(menunum)
			{case 1:
				JohnDoe.getBal();
				break;
			case 2:
				JohnDoe.getWithdrawal();
				break;
			case 3:
				JohnDoe.getDeposit();
				break;
			case 4:
			default:
				System.out.println("Have a good day!");
			}
		}
	
	kIn.close();}


}
