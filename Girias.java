class Girias {

    static String brand;
    static double price;
    static int capacity;
    static String type;
    static boolean automatic;
    static String color;
    static int warranty;
    static String model;
    static String energyRating;
    static double weight;

    public static boolean createWashingMachine(String brandName, double machinePrice,
                                               int loadCapacity, String machineType,
                                               boolean isAutomatic, String machineColor,
                                               int warrantyYears, String modelName,
                                               String energyStarRating, double machineWeight) {

        boolean isWashingMachineCreated = false;

        boolean isBrandValid = false;
        boolean isPriceValid = false;
        boolean isCapacityValid = false;
        boolean isTypeValid = false;
        boolean isColorValid = false;
        boolean isWarrantyValid = false;
        boolean isModelValid = false;
        boolean isEnergyRatingValid = false;
        boolean isWeightValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("brand is not valid");
        }

        if (machinePrice > 0) {
            price = machinePrice;
            isPriceValid = true;
        } else {
            System.out.println("price is not valid");
        }

        if (loadCapacity > 0) {
            capacity = loadCapacity;
            isCapacityValid = true;
        } else {
            System.out.println("capacity is not valid");
        }

        if (machineType != null && !machineType.isEmpty()) {
            type = machineType;
            isTypeValid = true;
        } else {
            System.out.println("type is not valid");
        }

        if (machineColor != null && !machineColor.isEmpty()) {
            color = machineColor;
            isColorValid = true;
        } else {
            System.out.println("color is not valid");
        }

        if (warrantyYears > 0) {
            warranty = warrantyYears;
            isWarrantyValid = true;
        } else {
            System.out.println("warranty is not valid");
        }

        if (modelName != null && !modelName.isEmpty()) {
            model = modelName;
            isModelValid = true;
        } else {
            System.out.println("model is not valid");
        }

        if (energyStarRating != null && !energyStarRating.isEmpty()) {
            energyRating = energyStarRating;
            isEnergyRatingValid = true;
        } else {
            System.out.println("energy rating is not valid");
        }

        if (machineWeight > 0) {
            weight = machineWeight;
            isWeightValid = true;
        } else {
            System.out.println("weight is not valid");
        }

        if (isBrandValid && isPriceValid && isCapacityValid &&
            isTypeValid && isColorValid && isWarrantyValid &&
            isModelValid && isEnergyRatingValid && isWeightValid) {

            automatic = isAutomatic;
            isWashingMachineCreated = true;
        }

        return isWashingMachineCreated;
    }

    public static void getWashingMachineDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
        System.out.println("Automatic: " + automatic);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model: " + model);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Weight: " + weight);
    }
}