class PhilipsAirFryerexecuter
{
    public static void main(String[] args)
    {
        double price = PhilipsAirFryer.getPrice();
        System.out.println("Price: " + price);

        String brand = PhilipsAirFryer.getBrand();
        System.out.println("Brand: " + brand);

        String capacity = PhilipsAirFryer.getCapacity();
        System.out.println("Capacity: " + capacity);

        String power = PhilipsAirFryer.getPower();
        System.out.println("Power: " + power);
    }
}