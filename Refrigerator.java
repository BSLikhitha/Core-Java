class Refrigerator
{
    static boolean isOn;
	static int currentChillLevel;
	static int maxChillLevel = 5;
	static int minChillLevel = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The refrigerator is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The refrigerator is turned off...");
        }
        return isOn;
    }
	public static void chillingincrease()
	{
		System.out.println("increse WaterLevel is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentChillLevel < maxChillLevel){
				currentChillLevel = currentChillLevel + 1;
			System.out.println("the current ChillLevel is:"+currentChillLevel);
			}else{
				System.out.println("max ChillLevel reached");
			}
		}
		else{
			System.out.println("turn on the Refrigerator");	

		}
	}
	public static void chillingdecrease()
	{
		System.out.println("decrease ChillLevel is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentChillLevel > minChillLevel){
				currentChillLevel = currentChillLevel - 1;
			System.out.println("the current ChillLevel is:"+currentChillLevel);
			}else{
				System.out.println("min ChillLevel reached");
			}
		}
		else{
			System.out.println("turn on the Refrigerator");	
		}
	}

}
