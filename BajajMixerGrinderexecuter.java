class BajajMixerGrinderexecuter
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