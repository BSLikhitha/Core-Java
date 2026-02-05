class Postoffice
{
	public static void main(String[] args)
	{
		String postofficeName = "Banglore postoffice";
		String owner = "vijay";
		String address = "Yeshwanthpur";
		String branches[] = {"JP Nagar","RR Nagar","Yelahanka"};
		String postofficers[] = {"Ram","Vishnu","Ravi"};
		
		System.out.println("The Postoffice info is:");
		System.out.println("The Postoffice name is"+" "+ postofficeName);
		System.out.println("The owner of the Postoffice"+" "+ owner);
		System.out.println("The address of the Postoffice"+" "+ address);
		
		System.out.println("The no of Branches are:"+" "+ branches.length);
		System.out.println("The list of barnches available :");
		for(String branch:branches)
		{
			System.out.println(branch);
		}
		System.out.println("The no of postofficers are:"+" "+ postofficers.length);
		System.out.println("The list of postofficers available :");
		for(String postofficer:postofficers)
		{
			System.out.println(postofficer);
		}
	}
}