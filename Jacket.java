class Jacket
{
	String brand;
	String color;
	String size;
	double price;
	boolean hasHood;

	Jacket()
	{
		System.out.println("Default constructor invoked");
	}

	Jacket(String brand,String color,String size,double price,boolean hasHood)
	{
		this.brand=brand;
		this.color=color;
		this.size=size;
		this.price=price;
		this.hasHood=hasHood;
		System.out.println("Parameterized constructor invoked");
	}
}