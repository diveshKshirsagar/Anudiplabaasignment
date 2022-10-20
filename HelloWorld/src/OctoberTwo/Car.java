package OctoberTwo;

class vehicle{
	protected String brand = "Ford";
	public void honk()
	{
	System.out.println("Tuut,tuut!");
}
}
 
public class Car extends vehicle{
	public String modelname= "Mustang";



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar= new Car();
		myCar.honk();
		System.out.println(myCar.brand+" "+myCar.modelname);		

	}

}
