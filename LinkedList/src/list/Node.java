package list;
public class Node{
	Node next;
	int data;
	public Node(int newData){
		next = null;
		data = newData;
	}
	public Node getNext(){
		return next;
	}
	public void setNext(Node newNext){
		next = newNext;
	}
	public int getData(){
		return data;
	}
	public void setData(int newData){
		data = newData;
	}
}