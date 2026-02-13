class Userprofile
{
	//static String userName = "Das";
	static int userName;
	public static void main(String[] args)
	{
		String userName = "baba";
		// String userName = "das"; redeclaration of the same reference is not valid in java
		userName = "das";  
		// userName = 78; this will give error
		Userprofile.userName = 78;
		System.out.println(userName);
		System.out.println(Userprofile.userName);
	}
}
