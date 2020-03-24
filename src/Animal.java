
public class Animal {

	//Data members
	private String name;
	private boolean hasLegs;

	//Constructors
	public Animal() {
		
	}
	
	public Animal(String name, boolean hasLegs) {
		super();
		this.name = name;
		this.hasLegs = hasLegs;
	}
	
	//Accessors and Mutators (getters and setters)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean hasLegs) {
		this.hasLegs = hasLegs;
	}
	
	//Member Methods
	public String toString(String name, boolean hasLegs)
	{
		
	}
}
