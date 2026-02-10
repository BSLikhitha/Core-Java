class Account {
    public static void main(String[] args) 
	{
        createAccount("Likhitha","Likhitha B S","likhithabs@gmail.com",
                      8123384803L,"Female","03/09/2004","Likhi@123","Likhi@123");
    }

    static void createAccount(String username, String fullName, String email,
                              long mobile, String gender, String dob,
                              String password, String confirmPassword) 
	{
        System.out.println("Username: " + username);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Password: " + password);
        System.out.println("Confirm Password: " + confirmPassword);
    }
}