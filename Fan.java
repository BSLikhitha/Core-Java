class Fan
{
    static boolean isOn;
	static int currentSpeed;
	static int maxSpeed = 5;
	static int minSpeed = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The fan is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The fan is turned off...");
        }
        return isOn;
    }
	public static void increaseSpeed()
	{
		System.out.println("increse speed is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed + 1;
			System.out.println("the current speed is:"+currentSpeed);
			}else{
				System.out.println("max speed reached");
			}
		}
		else{
			System.out.println("turn on the Fan");	

		}
	}
	public static void decreaseSpeed()
	{
		System.out.println("decrease speed is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentSpeed > minSpeed){
				currentSpeed = currentSpeed - 1;
			System.out.println("the current speed is:"+currentSpeed);
			}else{
				System.out.println("min speed reached");
			}
		}
		else{
			System.out.println("turn on the Fan");	

		}
	}
}