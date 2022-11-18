package BeanExample2;

public class Main {

	public static void main(String[] args) {
		EmployeeStudent obj =new EmployeeStudent();
		String[] sub = {"phy","chem","maths"};
		obj.setRollNo(512);
		obj.setName("DSK");
		obj.setSubject(sub);
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());
		String[] recsub=obj.getSubject();
		for(int i=0;i<recsub.length;i++)
		{
			System.out.println(recsub[i]);
		}
	}

}
