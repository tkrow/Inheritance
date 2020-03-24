
public class Cat extends Animal {

	//Force all new Cat object instances to have legs:
	public Cat(String name, boolean hasLegs) {
		super(name, hasLegs);
	}
	
	public Cat() {
		this.setHasLegs(true);
	}
}
