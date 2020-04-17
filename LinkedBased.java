package eg.edu.alexu.csd.datastructure.queue.cs;


public class LinkedBased implements IQueue , ILinkedBased {
	int size;
	
	public class Node {
		Object element;
		Node head;
		Node next;
	}
	
	class SinglyLinkedList{
		Node head;
		Node tail;
	}
	
	SinglyLinkedList queue = new SinglyLinkedList();

	@Override
	public void enqueue(Object item) {
		Node x=new Node();
		x.element=item;
		if (size==0)
			queue.head=queue.tail=x;
		else {
			queue.tail.next=x;
		}
		queue.tail=x;
		size++;
	}

	@Override
	public Object dequeue() {
		if (size == 0)
			throw new RuntimeException("Empty queue");
		Object item=queue.head.element;
		queue.head=queue.head.next;
		size--;
		if(size==0)
			queue.tail=null;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return size()==0;
	}

	@Override
	public int size() {
		return size;
	}

}
