package work_Personal;
import java.util.Random;
import java.util.Scanner; 

public class Invoker {
	
	// try using IF statements comparing casting[i][j] to randomspell
	
	public static void main(String[] args) {
		
		final String coldSnap = "qqqrd";
		final String ghostWalk = "qqwrd";
		final String iceWall = "qqerd";
		final String emp = "wwwrd";
		final String tornado = "wwqrd";
		final String alacrity = "wwerd";
		final String sunStrike = "eeerd";
		final String forgeSpirit = "eeqrd";
		final String chaosMeteor = "eewrd";
		final String deafeningBlast = "qwerd";
		
		String[] spells= new String[] {"coldSnap", "ghostWalk", "iceWall", "emp", "tornado", "alacrity", "sunstrike", "forgeSpirit", "chaosMeteor", "deafeningBlast"};
		String randomSpell = spells[new Random().nextInt(spells.length)];
		System.out.println(randomSpell);
		spells[0] = "qqqrd";
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Invoke the spell " + randomSpell);
		String result = sc.nextLine();
		
		if (result.equals(randomSpell)) {
			System.out.println("Correct, you must be very good at invoker Krappa");
		}
		
		else {
			System.out.println("WRONG! TrumpSmug");
		}
		sc.close();
		
	}	

}

