class Printer
{
    static boolean isOn;
	static int currentcopies;
	static int maxcopies = 100;
	static int mincopies = 0;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The printer is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The printer is turned off...");
        }
        return isOn;
    }
	public static void ptintingIncrease()
	{
		System.out.println("ptintingIncrease is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentcopies < maxcopies){
				currentcopies = currentcopies + 1;
			System.out.println("the current copies is:"+currentcopies);
			}else{
				System.out.println("max copies reached");
			}
		}
		else{
			System.out.println("turn on the printer");	

		}
	}
	public static void printingDecrease()
	{
		System.out.println("printingDecrease is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentcopies > mincopies){
				currentcopies = currentcopies - 1;
			System.out.println("the current copies is:"+currentcopies);
			}else{
				System.out.println("min copies reached");
			}
		}
		else{
			System.out.println("turn on the printer");	
		}
	}

}
