import java.util.ArrayList;

public class MakeCells {
	public static Map initLevel1(){
		Cell[][] map = new Cell[5][5];
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5;k++) {
//				Monster testMons = new Monster();asd
				//ArrayList<Item> its, String norm,String been,boolean[] opt, int x,int y,ArrayList<Monster> mL,boolean beenB
				String n = "xy = "+i+" "+k;
				ArrayList<Monster> mons = new ArrayList<Monster>(10);
				mons.add(new Monster("Scary monster",15,15,null,5,5));
				Cell c = new Cell(new ArrayList<Item>(10),n+" \nnew",n,new boolean[] {true,true,true,true},i,k,mons,false);
				map[i-1][k-1]=c;
			}
		}
		//First Cell [0][0] Monster+Cell creation
		ArrayList<Monster> cell00Monster = new ArrayList<Monster>(10);
		cell00Monster.add(new Monster("Bo", 10, 10, null, 50, 10));
		map [0][0]= new Cell(new ArrayList<Item>(), "This is the first place!", "You've been here before it's the first spot!", new boolean[] {true,true,false,false}, 0, 0,
				cell00Monster, false);
		//Cell[0][1] 
		ArrayList<Monster> cell01Monster = new ArrayList<Monster>(10);
		cell01Monster.add(new Monster("Argh", 15, 15, null, 50, 15));
		map [0][1]= new Cell(new ArrayList<Item>(), "You're in a cavern!", "You've been here before it's the cavern!", new boolean[] {true,true,true,false}, 0, 1,
				cell01Monster, false);
		//Cell[0][2] 
		ArrayList<Monster> cell02Monster = new ArrayList<Monster>(10);
		cell02Monster.add(new Monster("Esketit", 15, 15, null, 50, 15));
		map [0][2]= new Cell(new ArrayList<Item>(), "You're in a pub!", "You've been here before it's the pub!", new boolean[] {true,true,true,false}, 0, 2,
				cell02Monster, false);
		//Cell[0][3]
		ArrayList<Monster> cell03Monster = new ArrayList<Monster>(10);
		cell03Monster.add(new Monster("lilpumpernickel", 15, 15, null, 50, 15));
		map [0][3]= new Cell(new ArrayList<Item>(), "You're in a an open field!", "You've been here before it's the open field!", new boolean[] {true,true,true,false}, 0, 3,
				cell03Monster, false);
		//Cell[0][4]
		ArrayList<Monster> cell04Monster = new ArrayList<Monster>(10);
		cell04Monster.add(new Monster("Xander", 20, 20, null, 60, 20));
		map [0][4]= new Cell(new ArrayList<Item>(), "You're in a pub!", "You've been here before it's the pub!", new boolean[] {false,true,true,false}, 0, 4,
				cell04Monster, false);
		//Cell[1][0]
		ArrayList<Monster> cell10Monster = new ArrayList<Monster>(10);
		cell10Monster.add(new Monster("Sahr", 15, 15, null, 30, 10));
		map [1][0]= new Cell(new ArrayList<Item>(), "You're in a foreigners house!", "You've been here before it's the house!", new boolean[] {true,true,true,false}, 1, 0,
				cell10Monster, false);
		//Cell[1][1]
		ArrayList<Monster> cell11Monster = new ArrayList<Monster>(15);
		cell11Monster.add(new Monster("Harahs", 19, 19, null, 30, 10));
		map [1][1]= new Cell(new ArrayList<Item>(), "You're in a castle!", "You've been here before it's the castle!", new boolean[] {true,true,true,true}, 1, 1,
				cell11Monster, false);
		//Cell[1][2]
		ArrayList<Monster> cell12Monster = new ArrayList<Monster>(15);
		cell12Monster.add(new Monster("Coolio", 19, 19, null, 30, 10));
		map [1][2]= new Cell(new ArrayList<Item>(), "You're in a castle!", "You've been here before it's the castle!", new boolean[] {true,true,true,true}, 1, 2,
				cell12Monster, false);
		//Cell[1][3]
		ArrayList<Monster> cell13Monster = new ArrayList<Monster>(20);
		cell13Monster.add(new Monster("Busta", 20, 20, null, 30, 15));
		map [1][3]= new Cell(new ArrayList<Item>(), "You're in a abandoned house!", "You've been here before it's the abandoned house!", new boolean[] {true,true,true,true}, 1, 3,
				cell13Monster, false);
		//Cell[1][4]
		ArrayList<Monster> cell14Monster = new ArrayList<Monster>(25);
		cell14Monster.add(new Monster("Boolin", 25, 25, null, 50, 20));
		map [1][4]= new Cell(new ArrayList<Item>(), "You're in a canyon!", "You've been here before it's the canyon!", new boolean[] {false,true,true,true}, 1, 4,
				cell14Monster, false);
		
		
		return new Map(map,1);
	}
}
