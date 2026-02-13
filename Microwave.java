class Microwave
{
    static boolean isOn;
	static int currentPower;
	static int maxPower = 90;
	static int minPower = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The microwave is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The microwave is turned off...");
        }
        return isOn;
    }
	public static void increasePower()
	{
		System.out.println("increse power is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentPower < maxPower){
				currentPower = currentPower + 1;
			System.out.println("the current speed is:"+currentPower);
			}else{
				System.out.println("max power reached");
			}
		}
		else{
			System.out.println("turn on the Microwave");	

		}
	}
	public static void decreasePower()
	{
		System.out.println("decrease power is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentPower > minPower){
				currentPower = currentPower - 1;
			System.out.println("the current power is:"+currentPower);
			}else{
				System.out.println("min power reached");
			}
		}
		else{
			System.out.println("turn on the Microwave");	

		}
	}
}
