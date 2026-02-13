class Lightexecuter
{
    public static void main(String[] args)
    {
        boolean ref = Light.onOrOff();
        System.out.println("Light: " + ref);
		Light.increaseBrightness();
		Light.decreaseBrightness();
    }
}