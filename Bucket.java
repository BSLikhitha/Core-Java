class Bucket
{
	String color;
	int capacity;
	String material;
	double price;
	boolean hasHandle;

	Bucket()
	{
		System.out.println("Default constructor invoked");
	}

	Bucket(String color,int capacity,String material,double price,boolean hasHandle)
	{
		this.color=color;
		this.capacity=capacity;
		this.material=material;
		this.price=price;
		this.hasHandle=hasHandle;
		System.out.println("Parameterized constructor invoked");
	}
}