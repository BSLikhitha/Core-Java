class Projector
{
    static boolean isOn;

    static boolean onOrOff()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The projector is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The projector is turned off...");
        }
        return isOn;
    }
}
