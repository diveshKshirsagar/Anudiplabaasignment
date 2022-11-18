package Priocrity_Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<Integer> Stack = new ArrayDeque<>();
		Stack.push(10);
		Stack.push(12);
		Stack.push(23);
		
		Stack.forEach(s->System.out.println(s));
		
		System.out.println(Stack.peek());
		System.out.println(Stack.pop());
		System.out.println(Stack.peek());
	}

}
