package day12;

public class LibraryManagement {
	private String title;
	private String author;
	private double price;
	private int copies;
	
	public LibraryManagement() {
		
	}
	public LibraryManagement(String title,String author,double price,int copies) {
		this.title=title;
		this.author=author;
		this.price=price;
		this.copies=copies;
	}
	String gettitle() {
		
		return title;
	}
	String getAuthor() {
		
		return author;
	}
	double getPrice() {
		
		return price;
	}
	int getCopies() {
		
		return copies;
	}
	void settitle(String title) {
		
		this.title=title;
	}
	void setAuthor(String author) {
		
		this.author=author;
	}
	void setPrice(double price) {
		
		this.price=price;
	}
	void setCopies(int copies) {
		
		this.copies=copies;

	}
	public String toString() {
		
		return "LibraryManagement{title="+title+",author="+author+",price="+price+"copies="+copies+"}";
	}
}




















