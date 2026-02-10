class Prime
{
	public static void main(String[] args) 
	{
        primeAccount("Anu","Raj", "anuraj@gmail.com",8123384803L,"Anu Raj",
					  "Female","03/09/2004","anu@123","anu@123");
    }

    static void primeAccount(String firstName, String lastName, String email,
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