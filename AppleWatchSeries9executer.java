class AppleWatchSeries9executer
{
    public static void main(String[] args)
    {
        double price = AppleWatchSeries9.getPrice();
        System.out.println("Price: " + price);

        String brand = AppleWatchSeries9.getBrand();
        System.out.println("Brand: " + brand);

        String display = AppleWatchSeries9.getDisplay();
        System.out.println("Display: " + display);

        String connectivity = AppleWatchSeries9.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String battery = AppleWatchSeries9.getBatteryLife();
        System.out.println("Battery Life: " + battery);
    }
}