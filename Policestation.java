class Policestation
{
	public static void main(String[] args)
	{
		String policestationName = "Banglore policestation";
		String owner = "Raj";
		String address = "Magestic";
		String branches[] = {"Rajajinagar","Jayanagar","Vijaynagar"};
		String policeofficers[] = {"Arun","Arjun","Shivu"};
		
		System.out.println("The Policestation info is:");
		System.out.println("The Policestation name is"+" "+ policestationName);
		System.out.println("The owner of the Policestation"+" "+ owner);
		System.out.println("The address of the Policestation"+" "+ address);
		
		System.out.println("The no of Branches are:"+" "+ branches.length);
		System.out.println("The list of barnches available :");
		for(String branch:branches)
		{
			System.out.println(branch);
		}
		System.out.println("The no of policeofficers are:"+" "+ policeofficers.length);
		System.out.println("The list of policeofficers available :");
		for(String policeofficer:policeofficers)
		{
			System.out.println(policeofficer);
		}
	}
}