class Pocket
{
	String type;
	String color;
	int capacity;

	Pocket()
	{
		System.out.println("Default constructor invoked");
	}

	Pocket(String type,String color,int capacity)
	{
		this.type=type;
		this.color=color;
		this.capacity=capacity;
		System.out.println("Parameterized constructor invoked");
	}
}