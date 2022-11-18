package Genericdemo;
import java.util.Iterator;
import java.util.Vector;

public class vector_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Vector<String> v = new Vector<String>();
		
		v.add("Divesh");
		v.add("Alexs");
		v.add("Pooja");
		v.add("ohal");
		v.add("Mahesh");
		v.add("harry");
		Iterator<String> itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
