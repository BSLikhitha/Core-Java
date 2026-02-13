class NikonD7500executer
{
    public static void main(String[] args)
    {
        double price = NikonD7500.getPrice();
        System.out.println("Price: " + price);

        String brand = NikonD7500.getBrand();
        System.out.println("Brand: " + brand);

        String resolution = NikonD7500.getResolution();
        System.out.println("Resolution: " + resolution);

        String video = NikonD7500.getVideoQuality();
        System.out.println("Video Quality: " + video);

        String connectivity = NikonD7500.getConnectivity();
        System.out.println("Connectivity: " + connectivity);
    }
}