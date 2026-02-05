class Resturant
{
	public static void main(String[] args)
	{
		String resturantName = "Anmol";
		String owner = "Inchara";
		String address = "Durgigudi";
		String branches[] = {"Gopala","Ravindranagar","Nauvle"};
		String managers[] = {"SY","Arjun","Yukta"};
		
		System.out.println("The Resturantinfo is:");
		System.out.println("The Resturant name is"+" "+ resturantName);
		System.out.println("The owner of the Resturant"+" "+ owner);
		
		System.out.println("The address of the Resturant"+" "+ address);
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
		
		
	