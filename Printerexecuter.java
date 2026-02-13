class Printerexecuter
{
    public static void main(String[] args)
    {
        boolean ref = Printer.onOrOff();
        System.out.println("Printer: " + ref);
		Printer.ptintingIncrease();
		Printer.printingDecrease();
    }
}
