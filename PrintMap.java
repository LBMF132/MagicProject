import java.util.Scanner;

public class PrintMap {
	private static String introText="wlkjfs;alkdf;kjasd'";
	public static Map currentLevel;
	
	public static void main(String[] args) {
		Player.setEquippedWeapon(new Weapon("sord",10,10,3));
		currentLevel = MakeCells.initLevel1();
		introText = currentLevel.contents[0][0].normText;
		System.out.println(currentLevel.contents[0][0].normText);
		Scanner keyboardReader = new Scanner(System.in);
		while(true) {
			String s = keyboardReader.nextLine();
			System.out.println(ParserUtil.parse(s));
		}
	}
}
//atest