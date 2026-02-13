class WhirlpoolWashingMachineexecuter
{
    public static void main(String[] args)
    {
        double price = WhirlpoolWashingMachine.getPrice();
        System.out.println("Price: " + price);

        String brand = WhirlpoolWashingMachine.getBrand();
        System.out.println("Brand: " + brand);

        String capacity = WhirlpoolWashingMachine.getCapacity();
        System.out.println("Capacity: " + capacity);

        String type = WhirlpoolWashingMachine.getType();
        System.out.println("Type: " + type);

        String rating = WhirlpoolWashingMachine.getEnergyRating();
        System.out.println("Energy Rating: " + rating);
    }
}