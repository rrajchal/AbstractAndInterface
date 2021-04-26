/**
 * Crow class. This is a subclass to Animal
 * Crow is a bird species
 * @author Rajesh
 *
 */
public class Crow extends Animal {

	Crow(String name, double weight) {
		super(name, weight);
	}

	@Override
	String makeSound() {
		return "Crow chirps!";
	}

	@Override
	String move() {
		return "Crow jumps and fly!";
	}

	@Override
	public String respiration() {
		return "Crow breathes from mouth and nose.";
		
	}

	@Override
	public String reproduce() {
		return "Female crow lay 5 eggs and only once in her lifespan.";
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
