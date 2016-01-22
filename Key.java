import java.util.Scanner;

public class Key {
	
	public static String direction = "Enter a direction";
	public static String interaction = "";

	public static void Staller () {
		Scanner keyboard = new Scanner (System.in);
		direction = keyboard.nextLine ();
		if (direction.equals("w")) {
			System.out.println ("go up");
		}
		else if (direction.equals("a")) {
			System.out.println ("go left");
		}
		else if (direction.equals("s")) {
			System.out.println ("go down");
		}
		else if (direction.equals("d")) {
			System.out.println ("go right");
		}
		else  {
			System.out.println ("Utilise the WASD keys");
		}
	}

	/*public static void CheckSurroundings () {
		if ( World.map [(hero.getXcor() - 1), (hero.getYcor())] ) == "V" // for "Villager"
			{	
				interact ();
				if (interact () == true) {
					System.out.println ("This is a villager");
					}
			}
		else if ( World.map [(hero.getXcor() + 1), (hero.getYcor())] ) == "V" // for "Villager"
			{
				System.out.println ("This is a villager");
			}
		else if ( World.map [(hero.getXcor()), (hero.getYcor() - 1)] ) == "V" // for "Villager"
			{
				System.out.println ("This is a villager");
			}
		else if ( World.map [(hero.getXcor()), (hero.getYcor() + 1)] ) == "V" // for "Villager"
			{
				System.out.println ("This is a villager");
			}
		}*/

	public static boolean interact () {
		System.out.println ("Do you want to interact with this person? y, or n";
		Scanner keyboard = new Scanner (System.in);
		interaction = keyboard.nextLine ();
		if (interaction.equals ("n")) {
			return false;
			}
		else if (interaction.equals ("y")) {
			return true;
			}
		}

	public static void main (String [] args ) {
		System.out.println (myString);
		Staller ();
		}
	}
