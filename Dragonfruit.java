package Fruit;

public class Dragonfruit extends Fruit {
	
    private String name ;
	private int quantity;
	private double weight;
	
	    public Dragonfruit (String name, int q, double w) {
	    	
		super(name);
		this.quantity = q;
		this.weight = w;
		
		System.out.println(name + " constructor is invoked");
	}
	    public double totWeight() {
	    	return this.quantity * this.weight;
	    }
}
