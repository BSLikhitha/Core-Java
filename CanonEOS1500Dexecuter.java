class CanonEOS1500Dexecuter
{
    public static void main(String[] args)
    {
        double price = CanonEOS1500D.getPrice();
        System.out.println("Price: " + price);

        String brand = CanonEOS1500D.getBrand();
        System.out.println("Brand: " + brand);

        String resolution = CanonEOS1500D.getResolution();
        System.out.println("Resolution: " + resolution);

        String lens = CanonEOS1500D.getLensType();
        System.out.println("Lens Type: " + lens);

        String connectivity = CanonEOS1500D.getConnectivity();
        System.out.println("Connectivity: " + connectivity);
    }
}