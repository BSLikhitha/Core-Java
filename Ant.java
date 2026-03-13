class Ant
{
	String color;
	int legs;
	String type;

	Ant()
	{
		System.out.println("Default constructor invoked");
	}

	Ant(String color, int legs, String type)
	{
		this.color = color;
		this.legs = legs;
		this.type = type;
		System.out.println("Parameterized constructor invoked");
	}
}