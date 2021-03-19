/*
 CPS 161 MP2 
 Nicole Ramanathan
 */
package alphabet;

public class Alphabet {
	public static void main(String[] args) {
		char letter='a';
		while(letter <= 'z') 
		{
			
			System.out.print(letter);
			 switch (letter)
			 {
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
			 case 'y':
				 System.out.print(" is a vowel.");
				 break;
			default:
				System.out.print(" is a consonant.");
				
			 }
			 System.out.println();
			 letter++;
		}
		
		
	}
	

}
