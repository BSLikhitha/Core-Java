class Projector
{
    static boolean isOn;
	static int currentBrightness;
	static int maxBrightness = 10;
	static int minBrightness = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The projector is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The projector is turned off...");
        }
        return isOn;
    }
	public static void increaseBrightness()
	{
		System.out.println("increse brightness is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentBrightness < maxBrightness){
				currentBrightness = currentBrightness + 1;
			System.out.println("the current brightness is:"+currentBrightness);
			}else{
				System.out.println("max brightness reached");
			}
		}
		else{
			System.out.println("turn on the Projector");	

		}
	}
	public static void decreaseBrightness()
	{
		System.out.println("decrease brightness is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentBrightness > minBrightness){
				currentBrightness = currentBrightness - 1;
			System.out.println("the current brightness is:"+currentBrightness);
			}else{
				System.out.println("min brightness reached");
			}
		}
		else{
			System.out.println("turn on the Projector");	
		}
	}
}
