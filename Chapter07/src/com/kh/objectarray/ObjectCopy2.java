package com.kh.objectarray;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] bookArray1 = {
				new Book("태백산맥", "조정래"), 
				new Book("데미안", "헤르만 헤세"),
				new Book("어떻게 살 것인가", "유시민")
		};
		
		Book[] bookArray2 = new Book[3];
		
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray2[i] = new Book();
			
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==== bookArray1 ====");
		
		for (Book book : bookArray1) {
			book.showBookInfo();
		}
		
		System.out.println("==== bookArray2 ====");
		
		for (Book book : bookArray2) {
			book.showBookInfo();
		}
		
		
		
		
	}

}
