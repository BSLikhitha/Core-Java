class Racket
{
	String brand;
	String sportType;
	String material;
	String color;
	double weight;
	double price;
	String gripType;
	int length;
	String country;
	boolean isProfessional;

	Racket()
	{
		System.out.println("Default constructor invoked");
	}

	Racket(String brand,String sportType,String material,String color,double weight,double price,String gripType,int length,String country,boolean isProfessional)
	{
		this.brand=brand;
		this.sportType=sportType;
		this.material=material;
		this.color=color;
		this.weight=weight;
		this.price=price;
		this.gripType=gripType;
		this.length=length;
		this.country=country;
		this.isProfessional=isProfessional;

		System.out.println("Parameterized constructor invoked");
	}
}