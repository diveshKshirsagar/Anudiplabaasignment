package Priocrity_Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class Dqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
	/*	Deque<String>dq = new ArrayDeque<>();
		dq.add("for");
		dq.addFirst("Geeks");
		dq.addLast("Geeks");
		
		dq.forEach(s->System.out.println(s));
		
	*/
		
		Deque<String>dq = new ArrayDeque<>();
		dq.offer("for");
		dq.offerFirst("Geeks");
		dq.offerLast("Geeks");
		
		System.out.println(dq.getFirst()); //add fun
		dq.forEach(s->System.out.println(s));
		
		
	
	}

}
