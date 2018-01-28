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
		map [0][0]= new Cell(new ArrayList<Item>(), "This is the first cell!", "You've been here before it's the first cell!", new boolean[] {true,true,false,false}, 0, 0,
				cell00Monster, false);
		//Cell[0][1] 
		ArrayList<Monster> cell01Monster = new ArrayList<Monster>(10);
		cell01Monster.add(new Monster("Argh", 15, 15, null, 50, 15));
		map [0][1]= new Cell(new ArrayList<Item>(), "You're in a cavern!", "You've been here before it's the cavern!", new boolean[] {true,true,true,false}, 0, 1,
				cell01Monster, false);
		//Cell[0][2] comon man hi
		
		return new Map(map,1);
	}
}
