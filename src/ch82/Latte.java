package ch82;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	public void brewing() {
		super.brewing();
		System.out.print("Adding Milk ");
	}
}
