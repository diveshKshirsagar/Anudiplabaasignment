package Concitanation.java;
import java.util.Scanner;
public class Asending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1 = "hi welcome to this mentoring session";
      String[] list = str1.split(" ");
      String max = " ";
      for (int i=0;i<list.length;i++)
      {
    	  for (int j=1; i<list.length;j++)
    	  {
    		  if (list[i].length()<list[i].length())
    		  {
    			  max = list[j];
    			  list[j] = list[i];
    			  list[i] = max;
    		  }
    	  }
    	  
      }
          for (int i=0;i<list.length;i++)
        	  System.out.println(list[i]);      
	}

}
