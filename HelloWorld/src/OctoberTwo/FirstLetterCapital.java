package OctoberTwo;
import java.util.Scanner;
public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "there are no traffic rules followed by people";
        String words[]= str.split("\\s");
        String capitalizeword = "";
        for (String W:words) 
        {
        	String first = W.substring(0,1);
        	String afterfirst = W.substring(1);
        	capitalizeword+=first.toUpperCase()+afterfirst+""; 
        }
	}

}
