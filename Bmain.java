package book;

public class Bmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author MShell= new Author("Mary", "Shelley", 1797, 8, 30);
		Book Frank= new Book("Frankenstein", MShell, 9780553212471L, 19.99);
		System.out.println(Frank);
		
		

		Author ADoyle= new Author("Arthur", "Doyle", 1859, 5, 22);
		Book Bask= new Book();
		Bask.setBookAuth(ADoyle);
		Bask.setTitle("Hounds of the Baskervilles");
		Bask.setISBN(9780425104057L);
		Bask.setPrice(15.99);
		System.out.println(Bask);
		
		if (Bask.equals(Frank))
			System.out.println("Bask and Frank are the same\n");
		else
			System.out.println("Bask and Frank are different\n");
		
		
		Book Four= new Book(Bask);
		System.out.println(Four);
		if (Bask.equals(Four))
			System.out.println("Bask and Four are the same\n");
		else
			System.out.println("Bask and Four are different\n");
		
		Four.setTitle("The Sign of The Four");
		Four.setISBN(978154806252L);
		Four.setPrice(9.99);
		System.out.println(Four);
		
		if (Bask.equals(Four))
			System.out.println("Bask and Four are the same\n");
		else
			System.out.println("Bask and Four are different\n");
		
		if (Frank.equals(Four))
			System.out.println("Frank and Four are the same\n");
		else
			System.out.println("Frank and Four are different\n");
		
		
		
		

		
	}

}
