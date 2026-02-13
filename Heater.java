class Heater
{
    static boolean isOn;
	static int currentTemperature;
	static int maxTemperature = 10;
	static int minTemperature =0;

    static boolean Power()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The heater is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The heater is turned off...");
        }
        return isOn;
    }
	public static void increaseTemperature()
	{
		System.out.println("increse Temperature  is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature + 1;
			System.out.println("the current Temperature is:"+currentTemperature);
			}else{
				System.out.println("max Temperature reached");
			}
		}
		else{
			System.out.println("turn on the Heater");	

		}
	}
	public static void decreaseTemprature()
	{
		System.out.println("decrease Temperature is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentTemperature > minTemperature){
				currentTemperature = currentTemperature - 1;
			System.out.println("the current Temperature is:"+currentTemperature);
			}else{
				System.out.println("min Temperature reached");
			}
		}
		else{
			System.out.println("turn on the Heater");	
		}
	}
}