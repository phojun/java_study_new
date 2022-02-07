package ch58.queue;

import ch56.linkedlist.MyLinkedList;
import ch56.linkedlist.MyListNode;
/*
- 맨 앞(front) 에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가 함
- Fist In First Out (선입선출) 구조 
- 일상 생활에서 일렬로 줄 서 있는 모양
- 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용 되는 자료구조
- 콜센터에 들어온 문의 전화, 메세지 큐 등에 활용됨
*/

interface Queue{
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
	
}

public class MyLinkedQueue extends MyLinkedList implements Queue{
	
	MyListNode front;
	MyListNode rear;

	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData()+"추가완료");
		
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			return null;
		}
		String data = front.getData();
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println();
		
	}
	
	

}
