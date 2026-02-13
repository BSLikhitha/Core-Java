class Spotify
{
	static void saveUserAccount(String email,long phoneNumber)
	 {
		 System.out.println("Enter the email:"+email);
		 System.out.println("Enter the phoneNumber:"+phoneNumber);
	 }
	 
	public static void main(String[] args)
	{
		saveUserAccount("xyz@gmail.com",8123384803L);
	}
	 
}