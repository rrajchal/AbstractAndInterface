/**
 * Life interface. Any living beings will implements its methods
 * This is the super class (base class)
 * Library Information about interface
 * -----------------------------------
 * With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public.
 * Consider using interfaces if any of these statements apply to your situation:
 *		You expect that unrelated classes would implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelated classes.
 *		You want to specify the behavior of a particular data type, but not concerned about who implements its behavior.
 *		You want to take advantage of multiple inheritance of type.
 * @author Rajesh
 *
 */
interface Life {
	String respiration();
	String reproduce();
	
	// The default method does not have to be implemented in the sub-classes
	// If you implement, this method will be overwritten 
	// Note: default methods are not allowed in abstract classes
	default String message() {
		return "The message of this class is that the organism/plant/animal has a life.";
	}
}

