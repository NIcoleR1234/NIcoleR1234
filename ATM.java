package atm;

import java.util.Scanner;

public class ATM {

	static Scanner kIn = new Scanner(System.in);
	private double bal = 100;

	public void getBal() {

		System.out.println("The balance is: $" + bal);
	}

	public void getWithdrawal() {
		double wd;
		System.out.print("How much money do you want to withdraw? ");
		wd = kIn.nextDouble();
		if (bal >= wd) {
			bal = bal - wd;
			System.out.println("$" + wd + " has been withdrawn from your account.");
		} else {
			System.out.println("Transaction has been terminated.");
			System.out.println("Your balance is too low for withdrawal. ");
		}
	}

	public void getDeposit() {
		double de;
		System.out.print("How much money do you want to deposit? ");
		de = kIn.nextDouble();
		if (de < 0) {
			System.out.println("Transaction has been terminated.");
			System.out.println("The amount is too low to deposit. ");

		} else {
			bal = bal + de;
			System.out.println("$" + de + " has been added from your account.");
		}

	}

}
