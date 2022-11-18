package BeanExample2;
import java.io.Serializable;

public class EmployeeStudent implements Serializable {
	private int RollNo ;
	private String [] Subject;
	private String name;
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String[] getSubject() {
		return Subject;
	}
	public void setSubject(String[] subject) {
		Subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EmployeeStudent() {
		super();
	}
	
	
}
