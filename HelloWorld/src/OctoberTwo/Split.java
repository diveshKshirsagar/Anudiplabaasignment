package OctoberTwo;
import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text = "java is a fun programing language";
      String num = "11#22#33#44#55#66";
      String [] result = num.split("#");
      String [] res = {"11","22","33","44","55","66"};
      
      for (String i:result)
      {
    	  if (i.equals("44"))
    		  System.out.println(i);
      }

	}

}
