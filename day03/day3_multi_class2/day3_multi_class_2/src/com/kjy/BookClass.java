package com.kjy;

public class BookClass {
	String title=null;
	String author=null;
	String press=null;
	int price=0;
	String image=null;
	int dc=0;
	
	public BookClass() {
		
	}

	public BookClass(String title, String author, String press, int price, String image, int dc) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
		this.image = image;
		this.dc = dc;
	}
	

}
