package HelloPrint;

public class Grade {

	static
	{
		System.out.println("This is a static block");
	}	
	public static void main(String[] args) {
		int a=5;
		String name ="Divesh Kshirsgar";
		int c=2;
		System.out.println(a);
		System.out.println(name);
		c=5;
		a=8;
		
		System.out.println(c);
		float r = 5.5f;
		char k = 't';
		boolean mybol = true;
		System.out.println(k);
		System.out.println(mybol);
		System.out.println(r);
		
	}
}