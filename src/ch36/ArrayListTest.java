package ch36;

import java.util.ArrayList;

import ch34.array2.com.Book;//ctrl+shift+o 단축키로 호출

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("태백산맥1", "조정래"));
		library.add(new Book("태백산맥2", "조정래"));
		library.add(new Book("태백산맥3", "조정래"));
		
		/*
		 * for(int i =0; i<library.size();i++) { System.out.println(library.get(i)); }
		 */
		
		for(Book book : library) {
			System.out.println(book.toString());
		}
	}

}
