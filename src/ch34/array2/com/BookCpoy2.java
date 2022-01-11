package ch34.array2.com;

public class BookCpoy2 {
	// 깊은 복사
	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		//깊은복사는 system.arraycopy를 사용하지 않고 배열 인덱스 마다 따로 객체를 생성한다
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();

		//처음에는 원본 그대로를 복사해 본다
		for (int i = 0; i < library.length; i++) { 
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		System.out.println("==========원본 복사본 배열==========");
		for(Book book : copyLibrary) {
			System.out.println(book);
		}

		// library 원본배열만 수정
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		//copyLibrary cpoy배열만 수정
		copyLibrary[1].setTitle("별헤는밤");
		copyLibrary[1].setAuthor("윤동주");
		
		// 원본과 복사본이 따로 수정되는 것을 확인 할 수 있음
		System.out.println("============library============");
		for (Book book : library) {
			System.out.println(book);
		}

		System.out.println("==========copyLibrary==========");
		for (Book book : copyLibrary) {
			System.out.println(book);
		}

	}
}
