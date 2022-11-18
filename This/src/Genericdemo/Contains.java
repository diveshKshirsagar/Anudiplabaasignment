package Genericdemo;
import java.util.List;
import java.util.ArrayList;


public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>list = new ArrayList<>();
		
		list.add("Magician");
		list.add("Assigtant");
		list.add("Sd");
		list.add(0,"Ny");
		list.add(1,"FL");
		 
		System.out.println(list);
		System.out.println(list.contains("SD"));
		list.removeIf(s-> s.startsWith("A"));
		
		System.out.println(list);

	}
}
