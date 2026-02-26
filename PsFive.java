class PsFive {

    static String brand;
    static double price;
    static int storage;
    static String color;
    static boolean supports4K;

    public static boolean createPsFive(String brandName, double cost,
                                       int storageCapacity, String consoleColor,
                                       boolean is4KSupported) {

        boolean isPsFiveCreated = false;

        boolean isBrandValid = false;
        boolean isPriceValid = false;
        boolean isStorageValid = false;
        boolean isColorValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("brand is not valid");
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        } else {
            System.out.println("price is not valid");
        }

        if (storageCapacity > 0) {
            storage = storageCapacity;
            isStorageValid = true;
        } else {
            System.out.println("storage is not valid");
        }

        if (consoleColor != null && !consoleColor.isEmpty()) {
            color = consoleColor;
            isColorValid = true;
        } else {
            System.out.println("color is not valid");
        }

        if (isBrandValid && isPriceValid &&
            isStorageValid && isColorValid) {

            supports4K = is4KSupported;
            isPsFiveCreated = true;
        }

        return isPsFiveCreated;
    }

    public static void getPsFiveDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage);
        System.out.println("Color: " + color);
        System.out.println("4K Support: " + supports4K);
    }
}