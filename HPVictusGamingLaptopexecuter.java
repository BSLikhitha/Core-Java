class HPVictusGamingLaptopexecuter
{
    public static void main(String[] args)
    {
        double price = HPVictusGamingLaptop.getPrice();
        System.out.println("Price: " + price);

        String brand = HPVictusGamingLaptop.getBrand();
        System.out.println("Brand: " + brand);

        String processor = HPVictusGamingLaptop.getProcessor();
        System.out.println("Processor: " + processor);

        String ram = HPVictusGamingLaptop.getRAM();
        System.out.println("RAM: " + ram);

        String graphics = HPVictusGamingLaptop.getGraphics();
        System.out.println("Graphics: " + graphics);
    }
}