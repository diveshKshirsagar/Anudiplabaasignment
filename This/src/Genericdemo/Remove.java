package Genericdemo;
import java.util.List;
import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>birds = new ArrayList<>();
          
		birds.add("Hawk");
		birds.add("Dsk");
		
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("Hawk"));

	}

}
