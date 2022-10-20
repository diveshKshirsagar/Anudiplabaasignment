package OctoberTwo;

public class Hcf {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int n1=Integer.parseInt(args[0]);
	   	int n2=Integer.parseInt(args[1]); 
		int temp;
	   	while (n2 > 0)
	   	{
	   	     temp = n2;
	   	     n2 = n1% n2; 
	   	     n1 = temp;
	   	}
		System.out.println("hcf="+n1);

}
}