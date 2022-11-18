package Abstract;

abstract class Bank
{
	public abstract double rateofInterest();
	public void message()
	{
		System.out.println("Difffernt bank has differnt rate of interest");
	}
}	
	class Sbi extends Bank 
	{
		public double rateofInterest()
		{
			return 6.5;
		}
	}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sbi obj = new Sbi();
          obj.message();
          System.out.println(obj.rateofInterest());

}
}