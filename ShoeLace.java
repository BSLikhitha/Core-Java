class ShoeLace
{
	String brand;
	String color;
	String material;
	double price;
	double length;
	String style;
	boolean elastic;
	String thickness;
	String origin;
	String durability;

	ShoeLace()
	{
		System.out.println("Default constructor invoked");
	}

	ShoeLace(String brand,String color,String material,double price,double length,
	String style,boolean elastic,String thickness,String origin,String durability)
	{
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.length=length;
		this.style=style;
		this.elastic=elastic;
		this.thickness=thickness;
		this.origin=origin;
		this.durability=durability;

		System.out.println("Parameterized constructor invoked");
	}
}