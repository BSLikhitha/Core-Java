class Anklet
{
	String design;

	Anklet()
	{
		System.out.println("Default constructor invoked");
	}

	Anklet(String design)
	{
		this.design = design;
		System.out.println("Parameterized constructor invoked");
	}
}