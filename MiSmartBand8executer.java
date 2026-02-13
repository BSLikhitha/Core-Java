class MiSmartBand8executer
{
    public static void main(String[] args)
    {
        double price = MiSmartBand8.getPrice();
        System.out.println("Price: " + price);

        String brand = MiSmartBand8.getBrand();
        System.out.println("Brand: " + brand);

        String display = MiSmartBand8.getDisplay();
        System.out.println("Display: " + display);

        String battery = MiSmartBand8.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String water = MiSmartBand8.getWaterResistance();
        System.out.println("Water Resistance: " + water);
    }
}