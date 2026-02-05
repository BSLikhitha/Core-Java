class Cafe
{
	public static void main(String[] args)
	{
		String cafeName = "Glen's Bake House";
		String owner = "Riya";
		String address = "RR Nagar";
		String branches[] = {"Indiranagar","Koramangala","Whitefield","HSR Layout","Kalyan Nagar","Lavelle Road"};
		String managers[] = {"Archana","Prachi","Laasya","Luna","Vinith","Arun"};
		
		System.out.println("The Cafe info is:");
		System.out.println("The Cafe name is"+" "+ cafeName);
		System.out.println("The owner of the Cafe "+" "+ owner);
		System.out.println("The address of the Cafe "+" "+ address);
		
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