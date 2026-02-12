class Fan
{
    static boolean isOn;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The fan is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The fan is turned off...");
        }
        return isOn;
    }
}