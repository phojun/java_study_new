package ch53.objectclass.tostring;

public class Book {
	
	private String title;
	private String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {//object 클래스에 있는 메서드(오버라이딩 하여 사용할 수 있다)
		return "Book [title=" + title + ", author=" + author + "]";
	}

	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book.toString());
	}

}
