package This;

class Animal
{
	String name= "Animal";
	public void animalSound()
	{
		System.out.println("Animal Make Sound");
	}
}

class Dog extends Animal
{
	String dog = "Moti";
	public void animalSound()
	{
		System.out.println("Dog Says Bow Wow");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Animal obj = new Dog();
   obj.animalSound();
   System.out.println(obj.name);
		
	}

}
