package eg.edu.alexu.csd.datastructure.queue.cs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedBasedTest {

	LinkedBased q=new LinkedBased();
	@Test
	void testEnqueue() {
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		assertEquals(5,q.size());
	}

	@Test
	void testDequeue() {
		assertThrows(RuntimeException.class,()->{q.dequeue();});
		q.enqueue(1);
		q.enqueue(2);
		Object x=q.dequeue();
		assertEquals(1,x);
		assertEquals(1,q.size());
	}

	@Test
	void testIsEmpty() {
		assertTrue(q.isEmpty());
		q.enqueue(1);
		assertFalse(q.isEmpty());
	}

	@Test
	void testSize() {
		assertEquals(0,q.size());
		q.enqueue(1);
		q.enqueue(2);
		assertEquals(2,q.size());
		q.dequeue();
		assertEquals(1,q.size());
	}

}
