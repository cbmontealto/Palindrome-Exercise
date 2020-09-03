//variables
public class Dog {
	
	int age;
	String name;
	static int numberOfLegs = 4;   // Static Fields or Class Variables - Remain the same when you create a new object
		
	public void about(int age, String name) {    // Parameters - Declared within the methods signature. Arguments that are passed into a method.
		int ageNextYear = age + 1;   // Local Variables - Scope is only within the method in which they are declared. Declared and used within the method's curly braces.
		System.out.println("This dog's name is  " + name + ".");
		System.out.println("This dog is " + age + " years olds.");
		System.out.println("All dogs have " + numberOfLegs + " legs.");
		System.out.println("Next year this dog will turn " + ageNextYear + " years olds.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog Joey = new Dog();
		Joey.age = 5;   // Non-Static Variables or Instance Variables
		Joey.name = "Chu-Chu";
		Joey.about(Joey.age, Joey.name);
	}

}