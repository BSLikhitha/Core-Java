class JBLFlip5Speakerexecuter
{
    public static void main(String[] args)
    {
        double price = JBLFlip5Speaker.getPrice();
        System.out.println("Price: " + price);

        String brand = JBLFlip5Speaker.getBrand();
        System.out.println("Brand: " + brand);

        String battery = JBLFlip5Speaker.getBatteryLife();
        System.out.println("Battery Life: " + battery);

        String waterproof = JBLFlip5Speaker.getWaterproof();
        System.out.println("Waterproof: " + waterproof);

        String bluetooth = JBLFlip5Speaker.getBluetoothVersion();
        System.out.println("Bluetooth Version: " + bluetooth);
    }
}