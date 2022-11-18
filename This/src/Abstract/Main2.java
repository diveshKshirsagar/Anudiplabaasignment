package Abstract;

abstract class vehicle
{
	public abstract void run();
	public void message()
	{
		System.out.println("Diffrent bank have diffrent rate of interest");
	}
}

class car extends vehicle
{
	public void run()
	{
		System.out.println("run on disel engine");
	}
	
}

class Bike extends vehicle
{
	public  void run()
	{
		System.out.println("run on disel engine");
	}
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         car obj = new car();
         Bike obj1 = new Bike();
         obj.message();
         obj.run();
         obj1.run();

	}

}
