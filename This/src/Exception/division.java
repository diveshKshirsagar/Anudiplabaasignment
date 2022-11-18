package Exception;
import java.util.Scanner;


public class division {
	
	public static void divison(int a, int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Hello World");
		Scanner obj = new Scanner(System.in);
	    System.out.println("Enter two number");
	    int x = obj.nextInt();
	    System.out.println("Enter two number");
	    int y = obj.nextInt();
	    divison(x,y);
	    
	   String data = "123";
	    int z = Integer.parseInt(data);
	    System.out.println(z+100);
	    
	    //String num = "456";
	    //int num1 = Integer.parseInt(num);
	    //System.out.println(num1);
	}

}
