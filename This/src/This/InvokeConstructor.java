package This; 

class Student {
	
	Student()
	{
		this(102);
	System.out.println(" I am Defult constructor ");
	}
	
	Student (int r)
	{
		System.out.println(r);
	}
	
	void m()
	{
		System.out.println("Hello m");
		this.n();
	}
	
	void n()
	{
		System.out.println("hello n");
		
	}
}

public class InvokeConstructor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student(112);
		s2.n();
	}

}
