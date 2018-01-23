
public class Map {
	private int levelNumber;
	public Cell[][] contents;
	public Map(Cell[][] ce,int lN) {
		levelNumber=lN;
		contents=ce;
	}
}
