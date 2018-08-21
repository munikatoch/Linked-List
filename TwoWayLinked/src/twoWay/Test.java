package twoWay;
public class Test{
	public static void main(String[] args) {
		DoublyLinkedList <Integer> ll = new DoublyLinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.traverse();
		ll.traverseR();
		ll.deleteFirst();
		ll.traverse();
		ll.traverseR();
		ll.deleteLast();
		ll.traverse();
		ll.traverseR();
		ll.addFirst(1);
		ll.traverse();
		ll.traverseR();
		ll.addLast(7);
		ll.traverse();
		ll.traverseR();
		ll.delete(7);
		System.out.println();
		ll.traverse();
		ll.traverseR();
		System.out.println("size="+ll.size());
		System.out.println("first="+ll.peekFirst());
		System.out.println("last="+ll.peekLast());
		System.out.println("getF="+ll.getFirst());
		System.out.println("getL="+ll.getLast());
		System.out.println("get3="+ll.get(3));
	}
}