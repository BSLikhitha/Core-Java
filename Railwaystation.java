class Policestation
{
	public static void main(String[] args)
	{
		String policestationName = "YPR railwaystation";
		String owner = "ABC";
		String address = "";
		String branches[] = {"Gopala","Ravindranagar","Nauvle"};
		String managers[] = {"SY","Arjun","Yukta"};
		
		System.out.println("The Resturantinfo is:");
		System.out.println("The Resturant name is"+" "+ resturantName);
		System.out.println("The ownerof the Resturant"+" "+ owner);
		
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