/**
 * Dog class. This is a subclass to Animal
 * @author Rajesh
 *
 */
public class Dog extends Animal {

	Dog(String name, double weight) {
		super(name, weight);
	}

	@Override
	String makeSound() {
		return "Dog barks!";
	}

	@Override
	String move() {
		return "Dog walks and jumps!";
	}

	@Override
	public String respiration() {
		return "Dog breathes from mouth and nose.";
		
	}

	@Override
	public String reproduce() {
		return "Female Dog can reproduce 1-12 puppies per year.";
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %n%s: %s %n%s: %s %n%s: %s %n%s: %s", 
								super.toString(),
								"Sound", makeSound(),
								"Move", move(),
								"Respire", respiration(),
								"Reproduce", reproduce());
	}
	

}
