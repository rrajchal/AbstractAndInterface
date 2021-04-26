/**
 * Abstract class for animal. It implements Life. 
 * Any subclass which inherits this class will have to
 * implement all abstract methods from this class and all methods from Life
 * I am creating Animal class because I can make move() and makeSound() to differentiate from plants
 * Let's assume plants cannot move() or makeSound(). Plants cannot argue anyway!
 * This is a base class (super class) 
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
	abstract String makeSound();
	abstract String move();
	// Note that I am not implementing methods from Life. 
	// Even if you override here, it will have to be overwritten in subclass anyway. 
	
	/*
	 * This will print instance variables: name and weight 
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%s: %s %n%s: %s", "Name", getName(), "Weight", getWeight());
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}
}
