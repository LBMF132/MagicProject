import java.util.ArrayList;

public class Cell {
	public ArrayList<Item> cellItems = new ArrayList<Item>(10);
	public String normText;
	public String beenText;
	public boolean[] options;
	/*idx 0 - north
	 * idx 1 - east
	 * idx 2 - south
	 * idx 3 - west 
	 */
	public int xPos;
	public boolean beenThere;
	public int yPos;
	public ArrayList<Monster> cellMonsters = new ArrayList<Monster>(10);
	public Cell(ArrayList<Item> its, String norm,String been,boolean[] opt, int x,int y,ArrayList<Monster> mL,boolean beenB) {
		beenThere = beenB;
		cellItems = its;
		normText=norm;
		beenText=been;
		options = opt;
		xPos = x;
		yPos = y;
		cellMonsters = mL;
		beenThere = beenB;
	}
}
