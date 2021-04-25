package Fruit;

public class importApple extends Apple{

	private String colour;
	
	public importApple(String name, int q, int p, String c) {
		super(name, q, p);
		this.colour = c;
	}
	public String colourImportApple(){
		return this.colour;
	}
}
