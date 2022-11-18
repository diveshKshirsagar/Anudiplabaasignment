package ComparatorAndComparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Student> sdata = new ArrayList<>();
         sdata.add(new Student(101,"Divesh"));
         sdata.add(new Student(101,"Karan"));
         sdata.add(new Student(101,"Ohval"));
         
         Collections.sort(sdata);
         for (Student i:sdata)
         {
        	 System.out.println(i.getId()+" " +i.getName());
         }
         
         
	}

}

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	public Student (String name, int id)
	{
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
		return 0;
	}
}