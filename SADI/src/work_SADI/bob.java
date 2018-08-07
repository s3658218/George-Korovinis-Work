package work_SADI;

import java.util.Random;
import java.util.Scanner;

public class bob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
	}
	
public void Invoke() {
		
		String casting[][];
		casting = new String[2][10];
		
		casting[0][0] = "coldSnap";
		casting[0][1] = "qqqrd";
		casting[1][0] = "ghostWalk";
		casting[1][1] = "qqwrd";
		casting[2][0] = "iceWall";
		casting[2][1] = "qqerd";
		casting[3][0] = "emp";
		casting[3][1] = "wwwrd";
		casting[4][0] = "tornado";
		casting[4][1] = "wwqrd";
		casting[5][0] = "alactrity";
		casting[5][1] = "wwerd";
		casting[6][0] = "sunStrike";
		casting[6][1] = "eeerd";
		casting[7][0] = "forgeSpirit";
		casting[7][1] = "eeqrd";
		casting[8][0] = "chaosMetero";
		casting[8][1] = "eewrd";
		casting[9][0] = "deafeningBlast";
		casting[9][1] = "qwerd";
		
		
		String[] spells= new String[] {"coldSnap", "ghostWalk", "iceWall", "emp", "tornado", "alacrity", "sunstrike", "forgeSpirit", "chaosMeteor", "deafeningBlast"};
		String randomSpell = spells[new Random().nextInt(spells.length)];
		System.out.println(randomSpell);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Invoke the spell " + randomSpell);
		String result = sc.nextLine();
		/*
		String value;
		
		for (int i = 0; i < casting.length; i++) {
			for (int j = 0; j < casting[i].length; j++) {
				if (casting[i][j].equals(randomSpell)) {
					casting[i + 1][j];
				}
			}
		}
		*/
		if (result.equals(randomSpell)) {
			System.out.println("Correct, you must be very good at invoker Krappa");
		}
		
		else {
			System.out.println("WRONG! TrumpSmug");
		}
		sc.close();
	}
}
