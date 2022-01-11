package ch34.array2.com;

public class BookCopy {
	public static void main(String[] args) {
		
		//얕은배열복사 - 같은 주소를 가리키며 수정시 같이 수정됨 (같은 크기로 생성해야함)
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		//System.arraycopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드(주소만 복사)
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		//library 원본배열만 수정
		library[0].setTitle("나목");
		library[0].setAuthor("박완서"); 
		
		//copyLibrary cpoy배열만 수정
		copyLibrary[1].setTitle("별헤는밤");
		copyLibrary[1].setAuthor("윤동주");
		
		//원본과 복사본이 같이 수정되는 것을 확인 할 수 있음
		System.out.println("============library============");
		for(Book book : library) {
			System.out.println(book);
		}
		
		System.out.println("==========copyLibrary==========");
		for(Book book : copyLibrary) {
			System.out.println(book);
		}
		
	}
}
