class PrestigePressureCookerexecuter
{
    public static void main(String[] args)
    {
        double price = PrestigePressureCooker.getPrice();
        System.out.println("Price: " + price);

        String brand = PrestigePressureCooker.getBrand();
        System.out.println("Brand: " + brand);

        String capacity = PrestigePressureCooker.getCapacity();
        System.out.println("Capacity: " + capacity);

        String material = PrestigePressureCooker.getMaterial();
        System.out.println("Material: " + material);
    }
}