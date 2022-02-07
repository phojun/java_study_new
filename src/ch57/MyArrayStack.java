package ch57;

import ch55.MyArray;

public class MyArrayStack {
	
	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top=0;
		arrayStack= new MyArray();
	}
	
	public MyArrayStack(int size) {
		top=0;
		arrayStack=new MyArray(size);
	}
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(top==0) {
			System.out.println("stack is Empty");
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			arrayStack.addElement(data);
			top++;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is Empty");
			return MyArray.ERROR_NUM;
		}else {
			return arrayStack.removeElement(--top);
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is Empty");
			return MyArray.ERROR_NUM;
		}else {
			return arrayStack.getElement(--top);
		}
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
	

}
