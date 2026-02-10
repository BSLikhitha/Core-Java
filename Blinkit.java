class Blinkit
{
	public static void main(String[] args)
	{
		blinkitAccount("yasha@gmail.com", "Yasha", 9489169465L, "Female",
					   "10/07/2003", "RRnagar 8th block", "yasha@123", "yasha@123");
	}
	static void blinkitAccount(String email, String userName,
                              long mobile,  String gender, String dob,
                              String address, String password, String confirmPassword)
	{
		System.out.println("email:"+email);
		System.out.println("userName:"+userName);
		System.out.println("mobile:"+mobile);
		System.out.println("gender:"+gender);
		System.out.println("dateofbirth:"+dob);
		System.out.println("address:"+address);
		System.out.println("password:"+password);
		System.out.println("confirmPassword:"+confirmPassword);
	}
}