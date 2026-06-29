package com.janhvi;

class Book{
	private int Bookid;
	private String BookName;
	private String AuthourName;
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthourName() {
		return AuthourName;
	}
	public void setAuthourName(String authourName) {
		AuthourName = authourName;
	}
}

public class EncapculationBook {
	public static void main(String[] args) {
		Book b = new Book();
		b.setBookid(101);
		b.setBookName("Apptitude");
		b.setAuthourName("R S Agrawal");
		
		System.out.println(b.getBookid());
		System.out.println(b.getBookName());
		System.out.println(b.getAuthourName());
	}

}
