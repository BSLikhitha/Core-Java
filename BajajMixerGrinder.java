class BajajMixerGrinder
{
    static double getPrice()
    {
        System.out.println("fetching product price...");
        return 3499.00;
    }

    static String getBrand()
    {
        System.out.println("fetching product brand...");
        return "Bajaj";
    }

    static String getPower()
    {
        System.out.println("fetching power...");
        return "500 Watts";
    }

    static String getJars()
    {
        System.out.println("fetching number of jars...");
        return "3 Jars";
    }

    static String getWarranty()
    {
        System.out.println("fetching warranty...");
        return "2 Years";
    }
}

class BajajMixerGrinderExecuter
{
    public static void main(String[] args)
    {
        double price = BajajMixerGrinder.getPrice();
        System.out.println("Price: " + price);

        String brand = BajajMixerGrinder.getBrand();
        System.out.println("Brand: " + brand);

        String power = BajajMixerGrinder.getPower();
        System.out.println("Power: " + power);

        String jars = BajajMixerGrinder.getJars();
        System.out.println("Jars: " + jars);

        String warranty = BajajMixerGrinder.getWarranty();
        System.out.println("Warranty: " + warranty);
    }
}