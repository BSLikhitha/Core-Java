class Lg {

    static String brand;
    static double price;
    static int capacity;
    static String color;
    static int warranty;
    static boolean inverter;
    static int doors;
    static String coolingType;
    static double weight;
    static String model;

    public static boolean createRefrigerator(String brandName, double cost,
                                             int cap, String refColor,
                                             int years, boolean isInverter,
                                             int noOfDoors, String cooling,
                                             double refWeight, String modelName) {

        boolean isRefrigeratorCreated = false;

        boolean isBrandValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;
        boolean isDoorsValid = false;
        boolean isCoolingValid = false;
        boolean isWeightValid = false;
        boolean isModelValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        }

        if (cap > 0) {
            capacity = cap;
            isCapacityValid = true;
        }

        if (refColor != null && !refColor.isEmpty()) {
            color = refColor;
            isColorValid = true;
        }

        if (years > 0) {
            warranty = years;
            isWarrantyValid = true;
        }

        if (noOfDoors > 0) {
            doors = noOfDoors;
            isDoorsValid = true;
        }

        if (cooling != null && !cooling.isEmpty()) {
            coolingType = cooling;
            isCoolingValid = true;
        }

        if (refWeight > 0) {
            weight = refWeight;
            isWeightValid = true;
        }

        if (modelName != null && !modelName.isEmpty()) {
            model = modelName;
            isModelValid = true;
        }

        if (isBrandValid && isPriceValid && isCapacityValid &&
            isColorValid && isWarrantyValid && isDoorsValid &&
            isCoolingValid && isWeightValid && isModelValid) {

            inverter = isInverter;
            isRefrigeratorCreated = true;
        }

        return isRefrigeratorCreated;
    }

    public static void getRefrigeratorDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
    }
}