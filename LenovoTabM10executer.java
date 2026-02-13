class LenovoTabM10executer
{
    public static void main(String[] args)
    {
        double price = LenovoTabM10.getPrice();
        System.out.println("Price: " + price);

        String brand = LenovoTabM10.getBrand();
        System.out.println("Brand: " + brand);

        String screen = LenovoTabM10.getScreenSize();
        System.out.println("Screen Size: " + screen);

        String ram = LenovoTabM10.getRAM();
        System.out.println("RAM: " + ram);

        String storage = LenovoTabM10.getStorage();
        System.out.println("Storage: " + storage);
    }
}