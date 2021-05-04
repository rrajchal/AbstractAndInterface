/**
 * Abstract class for animal. It implements Life. 
 * Any subclass which inherits this class will have to
 * implement all abstract methods from this class and all methods from Life
 * I am creating Animal class because I can make move() and makeSound() to differentiate from plants
 * Let's assume plants cannot move() or makeSound(). Plants cannot argue anyway!
 * This is a base class (super class) 
 * Library information about Abstract
 * -------------------
 * Abstract classes are similar to interfaces. 
 * You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. 
 * You can declare fields that are not static and final, and define public, protected, and private concrete methods
 * Consider using abstract classes if any of these statements apply to your situation:
 *		You want to share code among several closely related classes.
 *		You expect that classes that extend your abstract class have many common methods or fields, or require access modifiers other than public (such as protected and private).
 *		You want to declare non-static or non-final fields. This enables you to define methods that can access and modify the state of the object to which they belong.
 * @author Rajesh
 *
 */
public abstract class Animal implements Life {
	
	String name;
	double weight;
	
	Animal(String name, double weight) {
		if (weight <= 0) {
			throw new IllegalArgumentException("Animal weight must be > 0.0");
		}
		if (name.equals("") || name == null) {
			throw new IllegalArgumentException("Animal name cannot be empty");
		}
		this.name = name;
		this.weight = weight;
	}
	// These two abstract methods + methods from Life must be implemented which inherits this class
	abstract String makeSound(); // you cannot add body, not even make default like in interface (to add a body)
	abstract String move();
	// Note that I am not implementing methods from Life. 
	// Even if you override here, it will have to be overwritten in subclass anyway.
	
	/*
	 * This will print instance variables: name and weight 
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %n%s: %s %n%s: %s", "Name", getName(), "Weight", getWeight(), "Message: ", message());
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
}
