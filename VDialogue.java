public class VDialogue {
	
	public static String Dialogue = "";

	public VDialogue () {
		Dialogue = "Hello, I am a villager.";
		}

	public static void Modify () {
		String [] Text = new String [3];
		Text [0] = "Honya";
		Text [1] = "Boingo";
		Text [2] = "Love";
      		Dialogue = Text [((int)(Math.random () * 2))];
		}
	
	public static void main (String [] args) {
		VDialogue V = new VDialogue ();
      		Modify ();
      		System.out.println (V.Dialogue);
		}
	}
