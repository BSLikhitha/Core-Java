class Forever24 {

    static String brand;
    static String clothType;
    static String size;
    static String color;
    static double price;
    static String material;
    static boolean washable;
    static String gender;
    static String fit;
    static int stock;
    static String country;
    static int warranty;

    public static boolean createCloth(String brandName, String type, String clothSize,
                                      String clothColor, double cost, String fabric,
                                      boolean isWashable, String forGender,
                                      String clothFit, int availableStock,
                                      String madeIn, int years) {

        boolean isClothCreated = false;

        boolean isBrandValid = false;
        boolean isTypeValid = false;
        boolean isSizeValid = false;
        boolean isColorValid = false;
        boolean isPriceValid = false;
        boolean isMaterialValid = false;
        boolean isGenderValid = false;
        boolean isFitValid = false;
        boolean isStockValid = false;
        boolean isCountryValid = false;
        boolean isWarrantyValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        }

        if (type != null && !type.isEmpty()) {
            clothType = type;
            isTypeValid = true;
        }

        if (clothSize != null && !clothSize.isEmpty()) {
            size = clothSize;
            isSizeValid = true;
        }

        if (clothColor != null && !clothColor.isEmpty()) {
            color = clothColor;
            isColorValid = true;
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        }

        if (fabric != null && !fabric.isEmpty()) {
            material = fabric;
            isMaterialValid = true;
        }

        if (forGender != null && !forGender.isEmpty()) {
            gender = forGender;
            isGenderValid = true;
        }

        if (clothFit != null && !clothFit.isEmpty()) {
            fit = clothFit;
            isFitValid = true;
        }

        if (availableStock >= 0) {
            stock = availableStock;
            isStockValid = true;
        }

        if (madeIn != null && !madeIn.isEmpty()) {
            country = madeIn;
            isCountryValid = true;
        }

        if (years >= 0) {
            warranty = years;
            isWarrantyValid = true;
        }

        if (isBrandValid && isTypeValid && isSizeValid && isColorValid &&
            isPriceValid && isMaterialValid && isGenderValid &&
            isFitValid && isStockValid && isCountryValid && isWarrantyValid) {

            washable = isWashable;
            isClothCreated = true;
        }

        return isClothCreated;
    }

    public static void getCloth() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + clothType);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}