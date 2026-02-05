class Chatshop
{
	public static void main(String[] args)
	{
		String chatNames[] = {"Papdi Chat","Dahi Puri","samosa","pani puri"};
		
		String papdichat = chatNames[0];
		String dahipuri = chatNames[1];
		
		System.out.println(papdichat+" "+dahipuri);
		
		System.out.println("The list of chat names using for each");
		for(String chatName:chatNames)
		{
			System.out.println(chatName);
		}
	}
}