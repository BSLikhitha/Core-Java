class WM
{
    static boolean isOn;

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
}
