class Elevator {

    static String brand;
    static int capacity;
    static int floors;
    static double speed;
    static boolean automatic;
    static String type;
    static int warranty;

    public static boolean createElevator(String brandName, int maxCapacity,
                                         int totalFloors, double liftSpeed,
                                         boolean isAutomatic, String liftType,
                                         int years) {

        boolean isElevatorCreated = false;

        boolean isBrandValid = false;
        boolean isCapacityValid = false;
        boolean isFloorsValid = false;
        boolean isSpeedValid = false;
        boolean isTypeValid = false;
        boolean isWarrantyValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        }

        if (maxCapacity > 0) {
            capacity = maxCapacity;
            isCapacityValid = true;
        }

        if (totalFloors > 0) {
            floors = totalFloors;
            isFloorsValid = true;
        }

        if (liftSpeed > 0) {
            speed = liftSpeed;
            isSpeedValid = true;
        }

        if (liftType != null && !liftType.isEmpty()) {
            type = liftType;
            isTypeValid = true;
        }

        if (years > 0) {
            warranty = years;
            isWarrantyValid = true;
        }

        if (isBrandValid && isCapacityValid && isFloorsValid &&
            isSpeedValid && isTypeValid && isWarrantyValid) {

            automatic = isAutomatic;
            isElevatorCreated = true;
        }

        return isElevatorCreated;
    }

    public static void getElevatorDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity);
        System.out.println("Floors: " + floors);
        System.out.println("Speed: " + speed);
        System.out.println("Automatic: " + automatic);
        System.out.println("Type: " + type);
        System.out.println("Warranty: " + warranty);
    }
}