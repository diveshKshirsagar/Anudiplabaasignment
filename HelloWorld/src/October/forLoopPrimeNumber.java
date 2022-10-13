package October;
import java.util.Scanner;
public class forLoopPrimeNumber {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
       for (int i=100; i<=200;i++)   
       {
    	   boolean flag= true;
    	   for (int j=2;j<=i;j++)
    		   if (i%j==0)
    		   {
    			   flag=false;
    			   break;
    		   }
    	   if(flag==true)
    	   {
    		   System.out.println("this is a prime number"+i);
    	   }
       }
}
}
*/
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		for (int i=a;i<=a;i++)
		{
			boolean flag = true;
			for (int j=2;j<i;j++)
				if(i%j==0)
				{
					System.out.println("this is a not prime number");
					flag=false;
                    break;
				}
			 if(flag==true)
	    	   {
	    		   System.out.println("this is a prime number"+i);
	    	   }
	       }
	}
}
	
