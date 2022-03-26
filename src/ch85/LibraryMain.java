package ch85;

import java.util.ArrayList;

class FastLibrary {

	public ArrayList<String> shelf = new ArrayList();

	public FastLibrary() {
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
		shelf.add("태백산맥 3");
		
	}

	public synchronized String lendBook() throws InterruptedException {

		Thread t = Thread.currentThread();
		
		while(shelf.size() == 0) {
			System.out.println(t.getName() + " wait() 중");
			wait();
			System.out.println(t.getName() + " wait() 끝");
		}
		if(shelf.size() > 0) {
			String book = shelf.remove(0);// 맨앞의 책을 빌려간다
			System.out.println(t.getName() + " : " + book + " lend");
			
			return book;
		}else {
			return null;
		}
		
	}

	public synchronized void returnBook(String book) {

		Thread t = Thread.currentThread();

		shelf.add(book);
		notifyAll();
		System.out.println(t.getName() + " : " + book + " return");
	}
}

class Student extends Thread {
	
	public Student(String name) {
		super(name);
	}

	public void run() {

		try {
			String book = LibraryMain.library.lendBook();
			if (book == null) {
				System.out.println(getName()+" 빌리지 못함");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(book);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {
	
	public static FastLibrary library = new FastLibrary();

	public static void main(String[] args) {

		Student s1 = new Student("s1");
		Student s2 = new Student("s2");
		Student s3 = new Student("s3");
		Student s4 = new Student("s4");
		Student s5 = new Student("s5");
		Student s6 = new Student("s6");
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		s5.start();
		s6.start();
		
	}

}
