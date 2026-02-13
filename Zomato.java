class Zomato
{
	public static void main(String[] args)
	{
		zomatoAccount("ritu@gmail.com", "Ritu", 9481969433L, "Female",
					 "09/03/2004", "Vijaynagar 5th block", "ritu@123", "ritu@123");
	}
	static void zomatoAccount(String email, String userName,
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