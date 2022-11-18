package Genericdemo;

import java.util.List;
import java.util.ArrayList;

public class ExampleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	List<String>list = new ArrayList<>();
	list.add("java");
	list.add("c++");
	list.add("c");
	list.add(" ");
	list.add("Pyton");
	  //List.removeIf(s->s.equals(" "));
	for (String s:list)
	{
		if(s.equals(" "))
		break;
	else
			System.out.println(s);
		
	}
	
	}

}
