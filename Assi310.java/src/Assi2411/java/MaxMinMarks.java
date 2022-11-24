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


	public Student(int id, String name, int age, int marks) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.marks = marks;
	}


	public void setId(int id) {
		this.id = id;
	}


public class MaxMinMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> obj=new ArrayList<>();
        obj.add(new Student(1,"Prajwal O",22,99));   //to add new student data   
		
		obj.add(new Student(2,"Divesh K",22,89));   //to add new student data  
		
		obj.add(new Student(3,"Suraj G",22,79));   //to add new student data  
		
		obj.add(new Student(4,"Saurabh J",22,69));  //to add new student data    
		
		obj.add(new Student(5,"Rupesh S",22,59));   //to add new student data  
		
		        //maximum marks Students
		   Student pa=obj.stream().max((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
		   System.out.println("Student with maximum marks ");
		   System.out.println("Name-"+pa.getName()+" "+"Marks-"+pa.getMarks());
				 
				 //minimum marks Students
			Student pn=obj.stream().min((Agent1,Agent2)->Agent1.getMarks()>Agent2.getMarks()?1:1).get();
			System.out.println("Student with minimum marks ");
			System.out.println("Name-"+pn.getName()+" "+"Marks-"+pn.getMarks());
	}
  }
}
