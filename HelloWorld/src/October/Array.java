package October;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] num= {1,2,3,4,5};
  String [] cars= {"volo","bmw","food","lambo","mercidise"};
  
  for (int i=0;i<cars.length;i++)
  {
	  System.out.println(cars[i]);
  }
  for (String i:cars)
  {
	  System.out.println(i);
  }
  for (int i=0;i<num.length;i++)
  {
	  System.out.println(num[i]);
  }
  for (int i:num)
  {
	  System.out.println(i);
  }
	}

}
