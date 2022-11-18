package This;

public class Mmethod {
	
	class Student {
		int rollno;
		String name;
		float fee;
		
		Student (int rollno,String name, float fee)
		{
			this.rollno = rollno;
			this.name= name;
			this.fee = fee;
		}
		
		void m ()
		{
			System.out.println("Hello m");
		}
		
		void n ()
		{
			System.out.println("Hello n");
			this.m();
		}
		
		void display()
		{
			System.out.println(rollno+""+name+""+fee);
		}
		
		
	}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	} 
	}
}
