class Speaker
{
	static boolean isconnected;
	static int currentVolume;
	static int maxVolume = 8;
	static int minVolume = 0;
	static boolean onoroff()
	{
		if(isconnected == false)
		{
			isconnected = true;
			System.out.println("The speaker is turned on...");
		}
		else if(isconnected == true)
		{
			isconnected = false;
			System.out.println("The speaker is turned off...");
		}
		return isconnected;
	}
	public static void increaseVolume()
	{
		System.out.println("increse volumeis invoked");
		System.out.println("no of args:"+0);
		if(isconnected == true)
		{
			if(currentVolume < maxVolume){
				currentVolume = currentVolume+1;
			System.out.println("the current volume is:"+currentVolume);
			}else{
				System.out.println("max volume reached");
			}
		}
		else{
			System.out.println("turn on the speaker");	

		}
	}
	public static void decreaseVolume()
	{
		System.out.println("decrease volumeis invoked");
		System.out.println("no of args:"+0);
		if(isconnected == true)
		{
			if(currentVolume > minVolume){
				currentVolume = currentVolume-1;
			System.out.println("the current volume is:"+currentVolume);
			}else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("turn on the speaker");	

		}
	}
}
	
				

		