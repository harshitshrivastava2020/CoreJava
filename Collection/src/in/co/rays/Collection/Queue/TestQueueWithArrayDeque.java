package in.co.rays.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueWithArrayDeque {
	public static void main(String[] args) {
		Queue q = new ArrayDeque();

		for (char h = 'a'; h <= 'z'; h++) {
			q.offer(h);
		}
		System.out.println("queue: " + q);
		System.out.println("this is the first element " + q.peek());// Queue uses FIFO so peek() methods provides first
																	// element
		System.out.println("queue: " + q);

		System.out.println("it remove first element: " + q.poll());// it remove first element because of FIFO so it
																	// remove first element
		System.out.println("queue: " + q);

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

		System.out.println("queue: " + q);
		System.out.println(q.peek());

	}
}
