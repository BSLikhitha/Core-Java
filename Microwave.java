class Microwave
{
    static boolean isOn;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The microwave is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The microwave is turned off...");
        }
        return isOn;
    }
}
