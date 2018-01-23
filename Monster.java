import java.util.ArrayList;

public class Monster {
	private String name;
	private int hp;
	private int hpMax;
	private int rDam;
	private int bDam;
	private ArrayList<Item> items = new ArrayList<Item>(10);
	public Monster(String n, int h, int hpM,ArrayList<Item> its,int r,int b) {
		setName(n);
		setHp(h);
		setHpMax(hpM);
		setItems(its);
		setrDam(r);
		setbDam(b);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHpMax() {
		return hpMax;
	}
	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public int getrDam() {
		return rDam;
	}
	public void setrDam(int rDam) {
		this.rDam = rDam;
	}
	public int getbDam() {
		return bDam;
	}
	public void setbDam(int bDam) {
		this.bDam = bDam;
	}
}
