package in.co.rays.Collection.List;

import java.util.Stack;

public class TestStack {
	// lifo last in first our
	public static void main(String[] args) {
		Stack s = new Stack();
		for (char h = 'a'; h <= 'z'; h++) {
			s.push(h);
		}
		System.out.println("stack: " + s);
		System.out.println("pick an element: " + s.peek());// last element display because of LIFO
		System.out.println("stack: " + s);
		System.out.println("remove an element: " + s.pop());// last element remove because of LIFO
		System.out.println("stack: " + s);

	}
}
