/**
 * This interface will be implemented by dangerous living beings
 * This is the super class (base class)
 * @author Rajesh
 *
 */
interface Danger {
	String harmful();
	String addiction();
	
	// The default method does not have to be implemented in the sub-classes
	// If you implement, this method will be overwritten 
	// Note: default methods are not allowed in abstract classes
	default String message() {
		return "The message of this class is that the organism/plant/animal is dangerous to consume.";
	}
}

