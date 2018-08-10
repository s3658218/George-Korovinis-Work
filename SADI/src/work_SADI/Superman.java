package work_SADI;

public class Superman extends FlyingSuperHero {
	public String name = "Superman";
	public String location = "to the fortress of Solitude";
	public Superman(String name) {
		super(name);
	}
	
	public void savesTheWorld() {
		System.out.printf("%s saves the world and Lois Lane again!", name);
		
	}
	
	public void fly() {
		System.out.printf("%s is flying %s", name, location);
		
	}
} 
	