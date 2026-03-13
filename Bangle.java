class Bangle
{
	String color;
	Bangle()
	{
		System.out.println("Default constructor invoked");
	}
	Bangle(String color)
	{
		this.color = color;
		System.out.println("Parameterized constructor invoked");
	}
}