package eg.edu.alexu.csd.datastructure.queue.cs;

public class ArrayBased implements IQueue , IArrayBased{

	int front=0;
	int rear=0;
	int N=0;
	Object [] queue;
	
	/**
	 * constructor for the array
	 * @param n
	 */
	public ArrayBased(int n){ 
		N =n;
		queue = new Object[n];
	}
	
	@Override
	public void enqueue(Object item) {
		if(front==(rear+1)%N)
			throw new RuntimeException("Full queue");
		queue[rear]=item;
		rear=(rear+1)%N;
	}

	@Override
	public Object dequeue() {
		if(isEmpty())
			throw new RuntimeException("Empty queue");
		Object temp=queue[front];
		queue[front]=null;
		front=(front+1)%N;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		return front==rear;
	}

	@Override
	public int size() {
		if(N==0)
			return 0;
		return (N-front+rear)%N;
	}

}
