class Netflix {
    public static void main(String[] args) 
	{
        netflixAccount("Likhitha","B S", "likhithabs@gmail.com",8123384803L,"Likhitha B S",
					  "Female","03/09/2004","Likhi@123","Likhi@123");
    }

    static void netflixAccount(String firstName, String lastName, String email,
                              long mobile, String userName, String gender, String dob,
                              String password, String confirmPassword) 
	{
        System.out.println("Username: " + firstName);
        System.out.println("Full Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
		System.out.println("userName: " + userName);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}