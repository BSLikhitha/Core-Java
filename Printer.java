class Printer
{
    static boolean isOn;

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
}
