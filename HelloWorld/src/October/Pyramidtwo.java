package October;

public class Pyramidtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* for (int i=1;i<=5;i++)
        {
        	for (int j=1;j<=i;j++)
        	{
        		System.out.print(i);
        	}
        	System.out.println();
        }
        
        for (int i=5;i>=1;i--)
        {
        	for (int j=1;j<=i;j++)
        	{
        		System.out.print(i);
        	}
        	System.out.println();
        }
        
	}*/
		
		int x=0;
		for (int i=1;i<=5;i++)
		{
			for (int j=5;j>=x+1;j--)
			{
				System.out.print(j);
			}
			for (int k=x+1;k<=5;k++)
			{
				System.out.print(k);
			}
				System.out.println();
			x=x+1;
			
		}
		
}
}