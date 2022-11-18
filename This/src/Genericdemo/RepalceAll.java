package Genericdemo;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class RepalceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		List<Integer> list= Arrays.asList(1,2,3);
		list.replaceAll(n->n*2);
		list.forEach(c->System.out.println(c));
		list.forEach(System.out::println);
		
	}

}
