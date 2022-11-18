package Genericdemo;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 5 birds name");
		
		List<String>birds = new ArrayList<>();
		
		for (int i=0;i<5;i++) {
			String name = obj.next();
			birds.add(name);
		}
		  Collections.sort(birds);
		  
		  for(int i=0;i<birds.size();i++)
		  {
			  System.out.println(birds.get(i));
		  }
		  birds.clear();
		  System.out.println(birds);
		
	}

}
