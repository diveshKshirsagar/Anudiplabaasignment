package Generic;

import java.util.List;
import java.util.ArrayList;


public class Stringadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list1 = new ArrayList<>();
		list1.add("RED");
		
		//list1.add(20);
		//list1.add(true);
		String s = (String)list1.get(0);
		System.out.println(s);

		 for (int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
	}

}
