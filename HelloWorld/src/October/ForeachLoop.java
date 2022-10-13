package October;
import java.util.ArrayList;
import java.util.Scanner;
public class ForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num = {1,2,3,4,5};
      
      int sum =0;
      for  (int i :num)
      {
    	  sum +=i;
      }
      System.out.println(sum);
      ArrayList<String> student=new ArrayList<>();
      student.add("kavita");
      student.add("Rohan");
      student.add("Divesh");
      
      for (String i:student)
      {
    	  System.out.println(i);
      }
	}
}
