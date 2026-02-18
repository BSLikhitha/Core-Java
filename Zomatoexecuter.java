class Zomatoexecuter
{
	public static void main(String[] args)
	{
		String foodName = "Benne Dosa";
		double anything = Zomato.search(foodName);
		System.out.println("The price of "+foodName+" "+ "is:" + anything);
	}
}
		