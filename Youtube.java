class Youtube
{
	public static void main(String[] args)
	{
		youtubeAccount("Roopa", "03/09/2004", "roopa@gmail.com", "Female", 8127884803L, "roopa@03", "roopa@03");
	}
	static void youtubeAccount(String fullName, String dob, String email, String gender, 
	                         long moblie, String password, String confirmpassword)
	{
		System.out.println("fullName: " + fullName);
        System.out.println("dateofbirth: " + dob);
        System.out.println("Email: " + email);
        System.out.println("gender: " + gender);
		System.out.println("moblie:" + moblie);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmpassword);
	}
}