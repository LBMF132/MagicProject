import java.util.ArrayList;

public class Player {
	public static int xPos=0;
	public static int yPos=0;
	public static int hpMax = 50;
	public static int currentHP = hpMax;
	private static Weapon equippedWeapon;
	public static ArrayList<Item> inventory = new ArrayList<Item>(10);
	public static Weapon getEquippedWeapon() {
		return equippedWeapon;
	}
	public static void setEquippedWeapon(Weapon eW) {
		equippedWeapon = eW;
	}
	
}
