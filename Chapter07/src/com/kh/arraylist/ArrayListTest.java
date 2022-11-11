package com.kh.arraylist;

import com.kh.objectarray.Book;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥","조정래"));
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생택쥐페리"));
		
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			
			book.showBookInfo();
		}
		
		
		System.out.println();
		System.out.println();
		
		library.remove(1);
		
		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println(library.isEmpty());
		
		library.remove(0);
		library.remove(0);
		
		System.out.println(library.isEmpty());
		
		
	}

}
