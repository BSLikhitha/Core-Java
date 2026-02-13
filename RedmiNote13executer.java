class RedmiNote13executer
{
    public static void main(String[] args)
    {
        double price = RedmiNote13.getPrice();
        System.out.println("Price: " + price);

        String brand = RedmiNote13.getBrand();
        System.out.println("Brand: " + brand);

        String os = RedmiNote13.getOS();
        System.out.println("OS: " + os);

        String ram = RedmiNote13.getRAM();
        System.out.println("RAM: " + ram);

        String storage = RedmiNote13.getStorage();
        System.out.println("Storage: " + storage);
    }
}