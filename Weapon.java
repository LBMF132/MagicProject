
public class Weapon extends Item{
	private int rDam;
	private int bDam;
//	public String name;
	public Weapon(String n,int v,int r,int b) {
		super(n,v);
		rDam=r;
		bDam=b;
	}
	public int getrDam() {
		return rDam;
	}

	public int getbDam() {
		return bDam;
	}

}
//Github test1
