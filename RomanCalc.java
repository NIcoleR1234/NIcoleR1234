package roman_calculator;

import java.util.Scanner;

public class RomanCalc {

	public static Scanner kbInput = new Scanner(System.in);

	public static String doMath(char operator, int firstNum, int secondNum) {
		/*
		 * This method will perform the arithmetic indicated by the operator (+ -* /),
		 * invoke convertToRoman to convert answer to Roman number, then return answer
		 */
		String roman = "";

		switch (operator) {
		case ('+'):
			roman = convertToRoman(firstNum + secondNum);
			break;
		case ('-'):
			roman = convertToRoman(firstNum - secondNum);
			break;
		case ('*'):
			roman = convertToRoman(firstNum * secondNum);
			break;
		case ('/'):
			roman = convertToRoman(firstNum / secondNum);
			break;
		}

		return roman;

	}

	public static char getOperator() {
		char oper;
		do {
			System.out.println("please choose an operator: +, - , * , or /:");
			oper = kbInput.next().charAt(0);
			if (oper != '+' && oper != '-' && oper != '*' && oper != '/')
				System.out.println("This operator is invalid *** try again");
		} while (oper != '+' && oper != '-' && oper != '*' && oper != '/');
		return oper;
	}

	public static int getOperands() {
		/*
		 * This routine should prompt the user to enter Roman number. convertFromRoman
		 * needs to be invoked to convert the Roman number to an integer. If the input
		 * is invalid (-1 returned from convertFromRoman) then complain and prompt the
		 * user again.
		 */
		int num = 0;
		String roman;
		do {
			System.out.println("Enter a Roman numeral: ");
			roman = kbInput.next();
			num = convertFromRoman(roman);
			if (num == -1)
				System.out.println("This number is invalid.");
		} while (num == -1);
		return num;
	}

	public static int convertFromRoman(String romanNum) {
		/*
		 * This method will convert Roman number to integer return -1 when input is
		 * invalid
		 * 
		 */
		int length = romanNum.length();
		int num = 0;
		for (int i = 0; i < length && num != -1; i++) {
			if (romanNum.substring(i, i + 1).equals("M") || romanNum.substring(i, i + 1).equals("m"))
				num += 1000;
			else if (romanNum.substring(i, i + 1).equals("D") || romanNum.substring(i, i + 1).equals("d"))
				num += 500;
			else if (romanNum.substring(i, i + 1).equals("C") || romanNum.substring(i, i + 1).equals("c"))
				num += 100;
			else if (romanNum.substring(i, i + 1).equals("L") || romanNum.substring(i, i + 1).equals("l"))
				num += 50;
			else if (romanNum.substring(i, i + 1).equals("X") || romanNum.substring(i, i + 1).equals("x"))
				num += 10;
			else if (romanNum.substring(i, i + 1).equals("V") || romanNum.substring(i, i + 1).equals("v"))
				num += 5;
			else if (romanNum.substring(i, i + 1).equals("I") || romanNum.substring(i, i + 1).equals("i"))
				num += 1;
			else
				num = -1;
		}
		return num;

	}

	public static String convertToRoman(int num) {
		/*
		 * This method will convert integer to Roman number
		 */
		String romanNum = "";

		while (num > 0) {
			if (num >= 1000) {
				romanNum += "M";
				num = num - 1000;
			} else if (num >= 500) {
				romanNum += "D";
				num = num - 500;
			} else if (num >= 100) {
				romanNum += "C";
				num = num - 100;
			} else if (num >= 50) {
				romanNum += "L";
				num = num - 50;
			} else if (num >= 10) {
				romanNum += "X";
				num = num - 10;
			} else if (num >= 5) {
				romanNum += "V";
				num = num - 5;
			} else if (num >= 1) {
				romanNum += "I";
				num = num - 1;
			} else
				System.out.println("This roman numeral is invalid.");

		}
		return romanNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result;
		do {

			result = doMath(getOperator(), getOperands(), getOperands());

			System.out.println(result);
			System.out.println("do you want to continue? y/n");
			kbInput.nextLine();
		} while (kbInput.nextLine().charAt(0) == 'y');
		System.out.println("Have a nice day!");
	}

}
