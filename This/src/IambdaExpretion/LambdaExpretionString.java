package IambdaExpretion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpretionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> name = new ArrayList<String>();
	       
       name.add("ohal");
       name.add("V.patil");
       name.add("Padwal");
       name.add("s.patil");
       
       name.forEach((m)->System.out.println(m));
        System.out.println("");
        
        name.forEach((m)->{
        	if (m.charAt(0)=='V')
        		System.out.println(m);
        	
        });
	}

}
