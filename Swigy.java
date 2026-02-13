class Swigy
{
	public static void main(String[] args)
	{
		swigyAccount("likhithabs@gmail.com", "LikhithaBS", 8123384803L, "Female",
					 "03/09/2004", "Rajajinagar 5th block", "liki@123", "liki@123"); 
	}
	static void swigyAccount( String email, String userName,
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