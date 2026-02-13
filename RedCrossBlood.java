class RedCrossBlood
{
	public static void main(String[] args)
	{
		createDonorAccount("abc@gmail.com",456,"likhitha","BS","Likhithabs",567004,"1234@&","1234@&");
		
	}
		static void createDonorAccount(String email, int donorId, String firstName, String lastName,String userName, int zipCode, String password, String repeatePassword)
		{
			System.out.println("The donor email is:"+email);
			System.out.println("The donor donorId is:"+donorId);
			System.out.println("The donor firstName is:"+firstName);
			System.out.println("The donor lastName is:"+lastName);
			System.out.println("The donor userName is:"+userName);
			System.out.println("The donor zipCode is:"+zipCode);
			System.out.println("The donor password is:"+password);
			System.out.println("The donor repeatePassword is:"+repeatePassword);
		}
}
	