class SamsungGalaxyWatch6executer
{
    public static void main(String[] args)
    {
        double price = SamsungGalaxyWatch6.getPrice();
        System.out.println("Price: " + price);

        String brand = SamsungGalaxyWatch6.getBrand();
        System.out.println("Brand: " + brand);

        String display = SamsungGalaxyWatch6.getDisplay();
        System.out.println("Display: " + display);

        String battery = SamsungGalaxyWatch6.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String connectivity = SamsungGalaxyWatch6.getConnectivity();
        System.out.println("Connectivity: " + connectivity);
    }
}