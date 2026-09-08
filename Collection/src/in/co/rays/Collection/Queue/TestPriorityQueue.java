package in.co.rays.Collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {

		Queue q = new PriorityQueue();
		q.add("Harshit");
		// q.add(5);// Runtime Exception :ClassCastException because first i would store
		// String element
		q.add("Hari");

		System.out.println("Queue: " + q);
	}
}
