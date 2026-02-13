class Microwaveexecuter
{
    public static void main(String[] args)
    {
        boolean ref = Microwave.onOrOff();
        System.out.println("Microwave: " + ref);
		Microwave.increasePower();
		Microwave.decreasePower();
    }
}
