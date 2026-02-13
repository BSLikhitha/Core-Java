class Instagram
{
	public static void main(String[] args)
	{
		instaAccount("Likhitha B S", "03/09/2004", "likhithabs03@gmail.com", "Female", 8123384803L, "liki@03", "liki@03");
	}
	static void instaAccount(String fullName, String dob, String email, String gender, 
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