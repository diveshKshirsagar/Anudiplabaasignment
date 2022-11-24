package Assi2411.java;
import java.util.List;
import java.util.ArrayList;

class Student
{
	int id;
	String Name;
	int age;
	int marks;
	public int getId() {
	return id;
	}

public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public void setId(int id) {
		this.id = id;
	}

public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}



public class StudentMarks {


	public static void main(String[] args) {
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Prajwal O",22,99)); //to add new student data    
		obj.add(new Student(2,"Divesh K",22,89)); //to add new student data   
		obj.add(new Student(3,"Suraj G",22,79)); //to add new student data   
		obj.add(new Student(4,"Rupesh S",22,69)); //to add new student data   
		obj.add(new Student(5,"Kaushik P",22,59)); //to add new student data   
		
		System.out.println("Sutdents which are having marks between 60 to 80 are ");//it will print Student which are having marks between 60 to 80 are
		obj.stream().filter(p->p.getMarks()<80).filter(p->p.getMarks()>60).forEach(s->System.out.println(s.getName()+" "+s.getMarks()));//stream method to get student marks
	 
	}
  }
}
