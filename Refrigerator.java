class Refrigerator
{
    static boolean isOn;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The refrigerator is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The refrigerator is turned off...");
        }
        return isOn;
    }
}
