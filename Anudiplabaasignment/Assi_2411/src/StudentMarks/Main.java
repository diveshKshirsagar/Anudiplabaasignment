package StudentMarks;
import java.util.List;
import java.util.ArrayList;

class Student
{
	int id;
	String Name;
	int age;
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


	int marks;
	public int getId() {
		return id;
	}
	

public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> obj=new ArrayList<>();
		obj.add(new Student(1,"Divesh K",22,99)); //to add new student data    
		obj.add(new Student(2,"Prajwal O",22,89)); //to add new student data
		obj.add(new Student(3," Suraj G",22,79)); //to add new student data   
		obj.add(new Student(4," Rupesh S",22,69)); //to add new student data
		obj.add(new Student(5,"Prajwal O",22,59)); //to add new student data

		
		obj.stream().forEach(j->System.out.println("Student Id-"+j.getId()+" "+"Name-"+j.getName()+" "+"Age"+j.getAge()+" "+"Marks"+j.getMarks()));
		//for each loop to get all student info
		
		System.out.println("Sutdents which are having marks between 60 to 80 are");
		//it will print students which are having marks between 60 to 80 are
		
		System.out.println("Sutdents which are having marks between 60 to 80 are");
		//it will print Students which are having marks between 60 to 80 are
		
	}
  }
}
