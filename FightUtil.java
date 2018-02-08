import java.util.ArrayList;
import java.util.Scanner;

public class FightUtil {
	public static void handleMonster() {
		ArrayList<Monster> ms = PrintMap.currentLevel.contents[Player.xPos][Player.yPos].cellMonsters;
		if (ms.size() > 0) {
			for (int i = 0; i < ms.size(); i++) {
				Monster monster = ms.get(i);
				System.out.println("You're attacked by a "+monster.getName());
				while (monster.getHp() > 0 && Player.currentHP > 0) {
					Scanner keyScanner = new Scanner(System.in);
					String cmd = keyScanner.nextLine();
					// TODO balance
					switch (cmd) {
					case "attack":
						int pDamage = (int) Math.round(Math.random() * Player.getEquippedWeapon().getrDam())
								+ Player.getEquippedWeapon().getbDam();
						if ((monster.getHp() - pDamage) > 0) {
							System.out
									.println("You attack the monster with your " + Player.getEquippedWeapon().getName()
											+ " for " + pDamage + " points of damage,\nkilling it.");
							return;
						} else {
							monster.setHp(monster.getHp() - pDamage);
							System.out.println("You attack the monster with your "
									+ Player.getEquippedWeapon().getName() + " for " + pDamage
									+ " points of damage, leaving it with " + monster.getHp() + " points of health.");
						}
						int wDamage = (int) Math.round(monster.getrDam() * Math.random()) + monster.getbDam();
						if ((Player.currentHP - wDamage) > 0) {
							Player.currentHP -= wDamage;
							System.out.println("The monster attacks you, leaving you with " + Player.currentHP + " HP");
						} else {
							System.out.println("You're dead");
							System.exit(0);
						}
						break;
					case "run":

						break;
					case "exit":

						break;
					case "defend":

						break;
					}
				}
			}
		}
		ms = PrintMap.currentLevel.contents[Player.xPos][Player.yPos].cellMonsters;
		if (ms.size() > 0) {
			for (int i = 0; i < ms.size(); i++) {
				Monster monster = ms.get(i);
				while (monster.getHp() > 0 || Player.currentHP > 0) {
					int pDamage = (int) Math.round(Math.random() * Player.getEquippedWeapon().getrDam())
							+ Player.getEquippedWeapon().getbDam();
					if ((monster.getHp() - pDamage) > 0) {
						System.out.println("You attack the monster with your " + Player.getEquippedWeapon().getName()
								+ " for " + pDamage + " points of damage,\nkilling it.");
						return;
					} else {
						monster.setHp(monster.getHp() - pDamage);
						System.out.println("You attack the monster with your " + Player.getEquippedWeapon().getName()
								+ " for " + pDamage + " points of damage, leaving it with " + monster.getHp()
								+ " points of health.");
					}
					int wDamage = (int) Math.round(monster.getrDam() * Math.random()) + monster.getbDam();
					if ((Player.currentHP - wDamage) > 0) {
						Player.currentHP -= wDamage;
						System.out.println("The monster attacks you, leaving you with " + Player.currentHP + " HP");
					} else {
						System.out.println("You're dead");
						System.exit(0);
					}
					// monster.setHp(Player.getEquippedWeapon().);
				}
			}
		}
	}
}
