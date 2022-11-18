package Abstract;

abstract class Bevereges
{
	public abstract  void inagrediens();
	public void addMik()
	{
		System.out.println("2 table Spoon");
	}
}

class Tea extends Bevereges
{
	public void ingrediens()
	{
		System.out.println("add one table spoon tea");
	}

	@Override
	public void inagrediens() {
		// TODO Auto-generated method stub
		
	}
}

class coffee extends Bevereges
{
	public void ingrediens()
	{
		System.out.println("add one table spoon cofee");
	}

	
}

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Tea obj = new Tea();
		coffee obj1 = new coffee();
	}

}
