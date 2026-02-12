class Light
{
    static boolean isOn;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The light is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The light is turned off...");
        }
        return isOn;
    }
}