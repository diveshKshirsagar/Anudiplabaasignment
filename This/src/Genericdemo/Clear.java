package Genericdemo;
import java.util.List;
import java.util.ArrayList;
public class Clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> birds = new ArrayList<>();
        
        birds.add("Hawk");
        birds.add("Robin");
        birds.add("Blue j");
        birds.add("Cardinal");
        
        for (int i=0; i<birds.size();i++)
        {
        	System.out.println(birds.get(i));
        }
        birds.clear();
          System.out.println(birds);
	}

}
