package Overriding.java;

 class Animal
 {
	 public String animalsound() 
  {
	System.out.println("Animal make sound");
	return "sound";
  }
}
 
 class Pig extends Animal{
	 public String animalsound()
	 {
		 System.out.println("Pig says weewee");
		 return "weeee";
	 }
	 
 public void sound()
 {
	 System.out.println("WEEEEEE");
 }
	 
 }
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Animal obj = new Animal();
		obj.animalsound();
		Animal obj1 = new Pig();
		obj1.animalsound();
	}

}
