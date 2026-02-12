class Heater
{
    static boolean isOn;

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
}