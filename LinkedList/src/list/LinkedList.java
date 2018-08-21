package list;
import java.util.Scanner;
public class LinkedList{
	int count;
	Node head;
	Node tail;
	LinkedList(){
		head = null;
		tail = null;
		count=0;
	}
	void add(int data){
		Node temp = new Node(data);
		if(head==null){
			head = temp;
			tail = head;
		}
		else{			
			tail.setNext(temp);
			tail = tail.getNext();
		}
	}
	void delete(){
		if(head==null){
			System.out.println("List is empty ");
		}
		else if(head.next==null){
			head=null;
			tail=null;
		}
		else{
			Node current = head;
			while(current.getNext().getNext()!=null){
				current = current.getNext();
			}
			current.setNext(null);
			tail = current;
		}
	}
	int peek(){
		return tail.getData(); 
	}
	boolean isEmpty(){
		return head==null;
	}
	void traverse(){
		Node current = head;
		while(current.getNext()!=null){
			System.out.print(current.getData()+"->");
			current = current.getNext();
		}
		System.out.print(current.getData());
		System.out.println();
	}
	void printReverse(Node current){
		if(current.getNext()==null){
			System.out.print(current.data);
		}
		else{
			printReverse(current.getNext());
			System.out.print("->"+current.data);
		}
	}
	public static void main(String []args){
		int n,i,data;
		Scanner sc = new Scanner(System.in);
		LinkedList ls = new LinkedList();
		System.out.println("Enter the number of elements you want to enter : ");
		n = sc.nextInt();
		for(i=0;i<n;i++){
			data=sc.nextInt();
			ls.add(data);
		}
		ls.traverse();
		System.out.println("Reverse : ");
		ls.printReverse(ls.head);
		System.out.println();
		System.out.println("Enter the number of elements you want to delete : ");
		n = sc.nextInt();
		for(i=0;i<n;i++){
			if(!ls.isEmpty())
				System.out.println(ls.peek()+" is deleted");
			ls.delete();
		}
		if(!ls.isEmpty()){
			ls.traverse();
			ls.printReverse(ls.head);
		}
		sc.close();
	}
}