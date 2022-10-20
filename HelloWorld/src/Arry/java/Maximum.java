package Arry.java;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array ={25,14,56,15,36,56,77,18,29,49};
        int max=0;
        int min = Array[0];
        
     /*   for (int x:Array)
        {
        	if(x>max)
        	{
        		max=x;
        	}
        }
        System.out.println(max);
	}

}
*/

System.out.println(max);
for (int x:Array)
  {
	if (x<min)
	{
		min=x;
	}
  }
    System.out.println(min);
}
}