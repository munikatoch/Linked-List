package twoWay;
public class DoublyLinkedList<L> {
	private Node <L> head=null,tail=null;
	private int count=0;
	public void add(L a){
		if(head==null){
			head = new Node<L>(a);
			tail=head;
			count++;
		}
		else{
			Node <L> temp = tail;
			tail.next=new Node<L>(a);
			tail=tail.next;
			tail.prev=temp;
			count++;
		}
	}
	public void addFirst(L a){
		Node<L> tmp;
		tmp=head;
		head.prev=new Node<L>(a);
		head=head.prev;
		head.next=tmp;
		count++;
	}
	public void addLast(L a){
		add(a);
	}
	public void delete(L a){
		Node <L> tmp=head;
		Node <L> temp=tail;
		int flag=0;
		if(head.x==a){
			head=head.next;
			head.prev=null;
			flag=1;
		}
		else if(tail.x==a){
			tail=tail.prev;
			tail.next=null;
			flag=1;
		}
		else{
			while(tmp.next.next!=null){
				if(tmp.next.x==a){
					tmp.next=tmp.next.next;
					tmp.next.prev=tmp;
					flag=1;
					break;
				}
				else if(temp.prev.x==a){
					temp.prev=temp.prev.prev;
					temp.prev.prev.next=temp;
					flag=1;
					break;
				}
				tmp=tmp.next;
				temp=temp.prev;
			}
		}
		if(flag==1){
			count--;
		}
		else
			System.out.println("Data not found");
	}
	public void deleteLast(){
		tail=tail.prev;
		tail.next=null;
		count--;
	}
	public void deleteFirst(){
		head=head.next;
		head.prev=null;
		count--;
	}
	public void traverse(){
		Node <L> tmp = head;
		while(tmp.next!=null){
			System.out.print(tmp.x+"->");
			tmp=tmp.next;
		}
		System.out.println(tmp.x);
	}
	public void traverseR(){
		Node<L>tmp = tail;
		while(tmp.prev!=null){
			System.out.print(tmp.x+"->");
			tmp=tmp.prev;
		}
		System.out.println(tmp.x);
	}
	
	public L get(int a){
		if(a>count)
			return null;
		Node <L>temp = head;
		while(a>1){
			temp=temp.next;
			a--;
		}
		return temp.x;
	}
	public L getFirst(){
		L a = get(0);
		return a;
	}
	public L getLast(){
		L a = get(count);
		return a;
	}
	public L peekFirst(){
		L a = get(0);
		return a;
	}
	public L peekLast(){
		L a = get(count);
		return a;
	}
	public int size(){
		return count;
	}
}
class Node<L>{
	Node<L> next;
	Node<L> prev;
	L x;
	Node(L a){
		x=a;
		next=null;
		prev=null;
	}
}