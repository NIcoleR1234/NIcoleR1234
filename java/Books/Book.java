package book;

import java.time.LocalDate;

class Author {

	private String fiName;
	private String laName;
	private LocalDate birthday;

	public Author() {
		
		this.fiName = "";
		this.laName = "";
		this.birthday = LocalDate.of(2000, 1, 1);
	}

	public Author(String fiName, String laName, int y, int m, int d) {
		
		this.fiName = fiName;
		this.laName = laName;
		this.birthday = LocalDate.of(y, m, d);
	}

	
	
	public void setBirthday(int y, int m, int d) {
		this.birthday = LocalDate.of(y, m, d);
	}

	@Override
	public String toString() {
		String authorinfo="Written by "+ laName + ", " + fiName + " who was born " + birthday + " (yyyy/mm/dd)";
		return authorinfo;
	}

}

public class Book {
	private String title;
	private Author bookAuth;
	private long ISBN;
	private double price;
	
	public Book() {
		
		this.title = "";
		this.bookAuth = new Author();
		this.ISBN = 0;
		this.price = 0;
	}

	public Book(String title, Author bookAuth, long iSBN, double price) {
		
		this.title = title;
		this.bookAuth = bookAuth;
		this.ISBN = iSBN;
		this.price = price;
		
	}
	
	public Book(Book first) {
		
		this.title = first.title;
		this.bookAuth = first.bookAuth;
		this.ISBN = first.ISBN;
		this.price = first.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getBookAuth() {
		return bookAuth;
	}

	public void setBookAuth(Author bookAuth) {
		this.bookAuth = bookAuth;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean equals(Book other) {
		return (this.title == other.title && this.bookAuth == other.bookAuth && this.ISBN == other.ISBN
				&& this.price == other.price);
	}

	@Override
	public String toString() {
		String bookinfo= title + "\n" + bookAuth + "\n"
				+ "ISBN:" + ISBN + "\n$" + price+"\n";
		return bookinfo;
	}

}
