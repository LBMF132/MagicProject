
public class ParserUtil {
	public static String parse(String s) {
		FightUtil.handleMonster();
		String toPrint = "emp-t";
		String[] parts = s.toLowerCase().split(" ",2);
		switch (parts[0]) {
		case "exit":
			System.out.println("Exiting");
			System.exit(0);
			break;
		case "go":
		case "move":
			if (parts.length > 0) {
				switch (parts[1]) {
				case "north":
					if(PrintMap.currentLevel.contents[Player.xPos][Player.yPos].options[0]) {
						Player.yPos++;
						System.out.println( PrintMap.currentLevel.contents[Player.xPos][Player.yPos].normText);
					}else {
						toPrint = "You cannot go north";
					}
					break;
				case "east":
					if(PrintMap.currentLevel.contents[Player.xPos][Player.yPos].options[1]) {
						Player.xPos++;
						return PrintMap.currentLevel.contents[Player.xPos][Player.yPos].normText;
					}else {
						toPrint = "You cannot go east";
					}
					break;
				case "south":
					if(PrintMap.currentLevel.contents[Player.xPos][Player.yPos].options[2]) {
						Player.yPos--;
						return PrintMap.currentLevel.contents[Player.xPos][Player.yPos].normText;

					}else {
						toPrint = "You cannot go south";
					}
					break;
				case "west":
					if(PrintMap.currentLevel.contents[Player.xPos][Player.yPos].options[3]) {
						Player.xPos--;
						return PrintMap.currentLevel.contents[Player.xPos][Player.yPos].normText;

					}else {
						toPrint = "You cannot go west";
					}
					break;
				}
			}
			break;
		case "take":
			for(Item iT:PrintMap.currentLevel.contents[Player.xPos][Player.yPos].cellItems) {
				if(iT.getName().equals(parts[1])) {
					Player.inventory.add(iT);
					PrintMap.currentLevel.contents[Player.xPos][Player.yPos].cellItems.remove(iT);
					return ("Took "+iT.getName());
				}
			}
			toPrint = "Cannot find that item";
			break;
		case "equip":
			for(Item iT:Player.inventory) {
				if(iT.getName().equals(parts[1])) {
					if(iT instanceof Weapon) {
						Player.setEquippedWeapon((Weapon)(iT));
						toPrint = "Equipped" + iT.getName();
					}
				}
			}
			break;
		default:
			toPrint = "That command doesn't work";
		}
		return toPrint;
	}
	public static void handleMonster() {
			for(Monster m:PrintMap.currentLevel.contents[Player.xPos][Player.yPos].cellMonsters) {
				
			}
		
	}
}
