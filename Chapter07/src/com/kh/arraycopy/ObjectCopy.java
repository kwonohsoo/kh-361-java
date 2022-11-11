package com.kh.arraycopy;

import com.kh.objectarray.Book;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = {
				new Book("태백산맥", "조정래"), 
				new Book("데미안", "헤르만 헤세"),
				new Book("어떻게 살 것인가", "유시민")
		};
		
		Book[] bookArray2 = new Book[3];
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);
		
		for (Book book : bookArray2) {
			book.showBookInfo();
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
