package Fruit;

public class localApple {
	
private String taste;
	
	public localApple(String name, int q, int p, String t) {
		super(name, q, p);
		this.taste = t;
	}
	public String tasteLocalApple(){
		return this.taste;
	}

}
