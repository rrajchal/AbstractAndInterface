/**
 * This class tests Abstract and Interface classes in a Polymorphic manner 
 * Polymorphism: IS-A relation - A parent (base, or super) class reference is used to refer child (subclass)
 * This is the main class and entry point to other classes
 * @author Rajesh
 *
 */
public class AbstractInterfaceTest {
	
	public static void main(String[] args) {
		
		print("Displaying Crow infomation...");
		// This runs okay
		try {
			Animal a = new Crow("black crow", 1.5);
			print(a);
		} catch (IllegalArgumentException e) {
			print("Exception occured: " + e.toString());
			print();
		}
		
		print("Displaying Crow infomation...");
		// this will throw an exception
		try {
			Animal a = new Crow("black crow", 0); // exception throws for 0
			print(a);
		} catch (IllegalArgumentException e) {
			print("Exception occured: " + e.toString());
			print();
		}
		
		// for testing multiple inheritance of Tobacco class
		print("Displaying Tobacco infomation...");
		Tobacco t = new Tobacco("Nicotiana tobacum");
		print(t);
		
		print("Displaying all");
		Life [] lives = new Life[3]; // This is not instantiation, just creating an array
		lives[0] = new Dog("Tommy", 5);
		lives[1] = new Crow("Honest Crow", 1.5);
		lives[2] = new Tobacco("Nicotiana tobacum");
		for (Life life : lives) {
			if (life instanceof Tobacco) 
				print("Danger, danger");
			print(life); // Dynamic binding or late binding. The type of object life is resolved at execution time. 
		}
		
		System.out.println("Program ran.");
	}
	
	// overloaded print method to display a new line
	static void print() {
		System.out.println();
	}
	
	// overloaded print method to display a string or an object
	static void print(Object o) {
		if (o instanceof String) {
			System.out.println(o.toString());
		} else {
			System.out.println(o); // invokes toString method of the object 
			System.out.println();
		}
		
	}

}
