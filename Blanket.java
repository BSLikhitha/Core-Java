class Blanket
{
	String brand;
	String color;
	String material;
	double price;
	double weight;
	String size;

	Blanket()
	{
		System.out.println("Default constructor invoked");
	}

	Blanket(String brand,String color,String material,double price,double weight,String size)
	{
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.weight=weight;
		this.size=size;

		System.out.println("Parameterized constructor invoked");
	}
}