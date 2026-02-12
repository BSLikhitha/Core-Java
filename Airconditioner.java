class Airconditioner
{
    static boolean isOn;

    static boolean Power()
    {
        if(isOn == false)
        {
            isOn = true;
            System.out.println("The AC is turned on...");
        }
        else
        {
            isOn = false;
            System.out.println("The AC is turned off...");
        }
        return isOn;
    }
}
