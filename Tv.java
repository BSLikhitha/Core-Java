class Tv
{
    static boolean isOn;

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
}
