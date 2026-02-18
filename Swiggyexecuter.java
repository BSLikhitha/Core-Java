class Swiggyexecuter
{
	public static void main(String[] args)
	{
		String foodName = "Gobi Manchurian";
		double anything = Swiggy.search(foodName);
		System.out.println("The price of "+foodName+" "+ "is:" + anything);
	}
}