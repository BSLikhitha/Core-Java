class Zeptoexecuter
{
	public static void main(String[] args)
	{
		String foodName = "Veg Cutlet";
		double anything = Zepto.search(foodName);
		System.out.println("The price of "+foodName+" "+ "is:" + anything);
	}
}