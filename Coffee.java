class Coffee
{
	String brand;
	int price;

	Coffee()
	{
		System.out.println("Default constructor invoked");
	}

	Coffee(String brand, int price)
	{
		this.brand = brand;
		this.price = price;
		System.out.println("Parameterized constructor invoked");
	}
}