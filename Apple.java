package Fruit;

public class Apple extends Fruit {
	
	private String name ;
	private int quantity;
	private int price;
	
	    public Apple (String name, int q, int p) {
	    	
		super(name);
		this.quantity = q;
		this.price = p;
		
		System.out.println(name + " constructor is invoked");
	}
	    public int totPrice() {
	    	return this.quantity * this.price;
	    }
}
