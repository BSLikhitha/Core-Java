class Light
{
    static boolean isOn;
	static int currentBrightness;
	static int maxBrightness = 6;
	static int minBrightness = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The light is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The light is turned off...");
        }
        return isOn;
    }
	public static void increaseBrightness()
	{
		System.out.println("increse Brightness is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentBrightness < maxBrightness){
				currentBrightness = currentBrightness + 1;
			System.out.println("the current Brightness is:"+currentBrightness);
			}else{
				System.out.println("max Brightness reached");
			}
		}
		else{
			System.out.println("turn on the Light");	

		}
	}
	public static void decreaseBrightness()
	{
		System.out.println("decrease Brightness is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentBrightness > minBrightness){
				currentBrightness = currentBrightness - 1;
			System.out.println("the current Brightness is:"+currentBrightness);
			}else{
				System.out.println("min Brightness reached");
			}
		}
		else{
			System.out.println("turn on the Light");	

		}
	}
}