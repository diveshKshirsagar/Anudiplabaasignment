package Overriding.java;

class Bank
{
	public double rateofInterest()
	{
		return 6.5;
	}
}

class SBI extends Bank
{
	public double rateofInterest()
	{
		return 10.8;
	}
}

class AXIS extends Bank
{
	public double rateofInterest()
	{
		return 12.9;
	}
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Bank obj = new Bank();
		System.out.println(obj.rateofInterest());
		SBI obj1 = new SBI();
		System.out.println(obj.rateofInterest());
	    AXIS obj2 = new AXIS ();
	    System.out.println(obj.rateofInterest());
	}

}
