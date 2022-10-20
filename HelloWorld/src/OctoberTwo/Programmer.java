package OctoberTwo;

class Employee
{
	int Salary = 400000;
}

public class Programmer extends Employee {
	int bouns = 1500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Programmer obj = new Programmer ();
  System.out.println("Total Salary"+(obj.Salary+obj.bouns));
	}

}
