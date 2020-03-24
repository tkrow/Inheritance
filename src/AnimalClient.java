
public class AnimalClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a new Animal Object
		Cat myCat = new Cat();	//starts with legs
		myCat.setHasLegs(false); 	//now doesn't
				
		myCat.setName("Fluffy");
		myCat.setHasLegs(true);
		
		//output myCat's data:
		System.out.println("Running AnimalClient.java:" + myCat.toString());
	}

}