class LGDoubleDoorFridgeexecuter
{
    public static void main(String[] args)
    {
        double price = LGDoubleDoorFridge.getPrice();
        System.out.println("Price: " + price);

        String brand = LGDoubleDoorFridge.getBrand();
        System.out.println("Brand: " + brand);

        String capacity = LGDoubleDoorFridge.getCapacity();
        System.out.println("Capacity: " + capacity);

        String rating = LGDoubleDoorFridge.getEnergyRating();
        System.out.println("Energy Rating: " + rating);

        String type = LGDoubleDoorFridge.getType();
        System.out.println("Type: " + type);
    }
}