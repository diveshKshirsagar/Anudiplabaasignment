package Exception;
import java.util.Scanner;

public class trycach {
	
	public static void division (int a , int b)
	{
		try
		{
			String data = "hwr";
			int z = Integer.parseInt(data);
			System.out.println("z+100");
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println("catch block"); // this will run
			
			//will show error
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two number");
		int y = obj.nextInt();
		int x = obj.nextInt();
		division(x,y);
	}

}
