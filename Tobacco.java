/**
 * Tobacco is class that implements Life and Danger interfaces
 * Tobacco like Nicotiana sp. is dangerous
 * @author Rajesh
 *
 */

public class Tobacco implements Life, Danger {
	String name;
	public String getName() {
		return name;
	}

	Tobacco(String name) {
		this.name = name;
	}
	
	@Override
	public String respiration() {
		return "Tobacco plant respires from leaves.";
		
	}

	@Override
	public String reproduce() {
		return "Tobacco plant produces millions of seeds per plant.";
	}
	
	@Override
	public String harmful() {
		return "Tobacco use is injurous to health";
	}

	@Override
	public String addiction() {
		return "Tobacco is addictive";
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %n%s: %s %n%s: %s %n%s: %s %n%s: %s",
								"Name", getName(),
								"Respire", respiration(),
								"Reproduce", reproduce(),
								"Harmful", harmful(),
								"Addiction", addiction());
	}
}
