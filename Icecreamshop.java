class Icecreamshop
{
	public static void main(String[] args)
	{
		String icecreamshopName = "Corner House";
		String owner = "Vidhi";
		String address = "Malleshwaram";
		String branches[] = {"Sadashivnagar","JP Nagar","Jayanagar","Basavanagudi","Seshadripuram"};
		String managers[] = {"Reena","Anu","Priya","Nihal","Rohan"};
		
		System.out.println("The Icecreamshop info is:");
		System.out.println("The Icecreamshop name is"+" "+ icecreamshopName);
		System.out.println("The owner of the Icecreamshop "+" "+ owner);
		System.out.println("The address of the Icecreamshop "+" "+ address);
		
		System.out.println("The no of Branches are:"+" "+ branches.length);
		System.out.println("The list of barnches available :");
		for(String branch:branches)
		{
			System.out.println(branch);
		}
		System.out.println("The no of managers are:"+" "+ managers.length);
		System.out.println("The list of managers available :");
		for(String manager:managers)
		{
			System.out.println(manager);
		}
	}
}