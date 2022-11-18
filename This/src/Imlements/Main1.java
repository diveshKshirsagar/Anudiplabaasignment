package Imlements;

interface printable
{
	public void print();
}

interface showable
{
	public void show();
}

public class Main1 implements printable,showable
{
	public void print()
	{
		System.out.println("print me");
	}
   
	public void show()
	{
		System.out.println("show me");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Main1 obj = new Main1();
		obj.print();
		obj.show();
	}

}
