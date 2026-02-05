class Gym
{
	public static void main(String[] args)
	{
		String gymName = "Cultfit";
		String owner = "Ram";
		String address = "Rjajinagar";
		String branches[] = {"Malleshwaram","Vijaynagar","Yelahanka"};
		String trainers[] = {"Raghu","Vihaan","Laksh"};
		
		System.out.println("The Gym info is:");
		System.out.println("The Gym name is"+" "+ gymName);
		System.out.println("The owner of the Gym "+" "+ owner);
		System.out.println("The address of the Gym "+" "+ address);
		
		System.out.println("The no of Branches are:"+" "+ branches.length);
		System.out.println("The list of barnches available :");
		for(String branch:branches)
		{
			System.out.println(branch);
		}
		System.out.println("The no of trainers are:"+" "+ trainers.length);
		System.out.println("The list of trainers available :");
		for(String trainer:trainers)
		{
			System.out.println(trainer);
		}
	}
}
