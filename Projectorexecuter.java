class Projectorexecuter
{
    public static void main(String[] args)
    {
        boolean ref = Projector.onOrOff();
        System.out.println("Projector: " + ref);
		Projector.increaseBrightness();
		Projector.decreaseBrightness();
    }
}
