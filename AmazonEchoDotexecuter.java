class AmazonEchoDotexecuter
{
    public static void main(String[] args)
    {
        double price = AmazonEchoDot.getPrice();
        System.out.println("Price: " + price);

        String brand = AmazonEchoDot.getBrand();
        System.out.println("Brand: " + brand);

        String assistant = AmazonEchoDot.getVoiceAssistant();
        System.out.println("Voice Assistant: " + assistant);

        String connectivity = AmazonEchoDot.getConnectivity();
        System.out.println("Connectivity: " + connectivity);

        String color = AmazonEchoDot.getColor();
        System.out.println("Color: " + color);
    }
}