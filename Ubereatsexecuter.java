class Ubereatsexecuter
{
	public static void main(String[] args)
	{
		String foodName = "Peri Peri Fries";
		double anything = Ubereats.search(foodName);
		System.out.println("The price of "+foodName+" "+ "is:" + anything);
	}
}