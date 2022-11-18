package Genericdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Push_pop_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<String> slist = new ArrayList<>();
		slist.add(new String ("Pooja"));
		Stack<String> v= new Stack<>();
		
		v.push("Ohval");
		v.push("Divesh");
		v.push("Mahesh");
		v.push("Suraj");
		v.pop();
		v.pop();
		Iterator<String>itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}


