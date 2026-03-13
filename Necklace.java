class Necklace
{
	String brand;
	String color;
	String material;
	double price;
	double weight;
	String size;
	String design;
	boolean adjustable;
	int stones;
	String type;
	String origin;
	String finish;
	String style;
	String gender;
	String claspType;
	String plating;
	String durability;
	String usage;
	String warranty;
	String manufacturer;

	Necklace()
	{
		System.out.println("Default constructor invoked");
	}

	Necklace(String brand,String color,String material,double price,double weight,String size,
	String design,boolean adjustable,int stones,String type,String origin,String finish,
	String style,String gender,String claspType,String plating,String durability,
	String usage,String warranty,String manufacturer)
	{
		this.brand=brand;
		this.color=color;
		this.material=material;
		this.price=price;
		this.weight=weight;
		this.size=size;
		this.design=design;
		this.adjustable=adjustable;
		this.stones=stones;
		this.type=type;
		this.origin=origin;
		this.finish=finish;
		this.style=style;
		this.gender=gender;
		this.claspType=claspType;
		this.plating=plating;
		this.durability=durability;
		this.usage=usage;
		this.warranty=warranty;
		this.manufacturer=manufacturer;

		System.out.println("Parameterized constructor invoked");
	}
}