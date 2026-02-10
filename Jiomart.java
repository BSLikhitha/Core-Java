class Jiomart
{
	public static void main(String[] args)
	{
		jiomartAccount("dev@gmail.com", "Dev", 9481969465L, "Male",
					   "05/02/2003", "Malleshwaram 8th block", "dev@123", "dev@123");
	}
	static void jiomartAccount(String email, String userName,
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