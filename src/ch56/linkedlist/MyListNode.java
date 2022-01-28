package ch56.linkedlist;

public class MyListNode {
	
	//- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조
	//- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있음
	//- 자료가 추가 될때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결함 (정해진 크기가 없음)
	//- 연결 리스트의 i 번째 요소를 찾는게 걸리는 시간은 요소의 개수에 비례 : O(n)
	//- jdk 클래스 : LinkedList
	
	private String  data; //자료값
	public MyListNode next;// 다음 노드를 가르키는 링크
	
	public MyListNode(){
		data = null;
		next = null;
	}

	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}

}
