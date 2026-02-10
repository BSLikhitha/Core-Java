class Epicgames
{
	public static void main(String[] args)
	{
		epicgamesAccount("Yuva", "29/10/2004", "yuva@gmail.com", "Male", 8123387603L, "yuv@10", "yuv@10");
	}
	static void epicgamesAccount(String fullName, String dob, String email, String gender, 
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