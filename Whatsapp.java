class Whatsapp
{
	public static void main(String[] args)
	{
		whatsappAccount("Laksh", "10/01/2008", "laksh04@gmail.com", "Male", 9123385603L, "laksh@01", "laksh@01");
	}
	static void whatsappAccount(String fullName, String dob, String email, String gender, 
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