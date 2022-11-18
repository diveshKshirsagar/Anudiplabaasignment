package Genericdemo;

import java.util.Iterator;
import java.util.Stack;

public class Push_Pop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Stack<String> v= new Stack<>();
		
		v.push("Divesh");
		v.push("Ovhal");
		v.push("Harry");
		v.push("Lalit");
		v.pop();
		v.pop();
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			{
			System.out.println(itr.next());
			}
	}

}
