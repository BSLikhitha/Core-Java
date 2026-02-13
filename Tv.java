class Tv
{
    static boolean isOn;
	static int currentTvVolume;
	static int maxTvVolume = 90;
	static int minTvVolume = 0;

    static boolean Power()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The television is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The television is turned off...");
        }
        return isOn;
    }
	public static void increaseTvVolume()
	{
		System.out.println("increse TvVolume is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentTvVolume < maxTvVolume){
				currentTvVolume = currentTvVolume + 1;
			System.out.println("the current TvVolume is:"+currentTvVolume);
			}else{
				System.out.println("max TvVolume reached");
			}
		}
		else{
			System.out.println("turn on the Tv");	

		}
	}
	public static void decreaseTvVolume()
	{
		System.out.println("decrease TvVolume is invoked");
		System.out.println("no of args:"+0);
		if(isOn == true)
		{
			if(currentTvVolume > minTvVolume){
				currentTvVolume = currentTvVolume - 1;
			System.out.println("the current TvVolume is:"+currentTvVolume);
			}else{
				System.out.println("min TvVolume reached");
			}
		}
		else{
			System.out.println("turn on the Tv");	

		}
	}
}
