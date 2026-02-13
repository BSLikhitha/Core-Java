class WM
{
    static boolean isOn;
	static int currentWaterLevel;
	static int maxWaterLevel = 10;
	static int minWaterLevel = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The washing machine is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The washing machine is turned off...");
        }
        return isOn;
    }
	public static void increaseWaterLevel()
	{
		System.out.println("increse WaterLevel is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentWaterLevel < maxWaterLevel){
				currentWaterLevel = currentWaterLevel + 1;
			System.out.println("the current WaterLevel is:"+currentWaterLevel);
			}else{
				System.out.println("max WaterLevel reached");
			}
		}
		else{
			System.out.println("turn on the WM");	

		}
	}
	public static void decreaseWaterLevel()
	{
		System.out.println("decrease WaterLevel is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentWaterLevel > minWaterLevel){
				currentWaterLevel = currentWaterLevel - 1;
			System.out.println("the current WaterLevel is:"+currentWaterLevel);
			}else{
				System.out.println("min WaterLevel reached");
			}
		}
		else{
			System.out.println("turn on the WM");	
		}
	}
}
