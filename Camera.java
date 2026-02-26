class Camera {

    static String brand;
    static String model;
    static double price;
    static int megaPixels;
    static String color;
    static String lensType;
    static boolean nightVision;
    static int warranty;
    static String batteryType;
    static double weight;

    public static boolean createCamera(String brandName, String modelName,
                                       double cost, int pixels,
                                       String cameraColor, String lens,
                                       boolean isNightVision,
                                       int warrantyYears,
                                       String battery,
                                       double cameraWeight) {

        boolean isCameraCreated = false;

        boolean isBrandValid = false;
        boolean isModelValid = false;
        boolean isPriceValid = false;
        boolean isPixelsValid = false;
        boolean isColorValid = false;
        boolean isLensValid = false;
        boolean isWarrantyValid = false;
        boolean isBatteryValid = false;
        boolean isWeightValid = false;

        if (brandName != null && !brandName.isEmpty()) {
            brand = brandName;
            isBrandValid = true;
        } else {
            System.out.println("brand is not valid");
        }

        if (modelName != null && !modelName.isEmpty()) {
            model = modelName;
            isModelValid = true;
        } else {
            System.out.println("model is not valid");
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        } else {
            System.out.println("price is not valid");
        }

        if (pixels > 0) {
            megaPixels = pixels;
            isPixelsValid = true;
        } else {
            System.out.println("megapixels is not valid");
        }

        if (cameraColor != null && !cameraColor.isEmpty()) {
            color = cameraColor;
            isColorValid = true;
        } else {
            System.out.println("color is not valid");
        }

        if (lens != null && !lens.isEmpty()) {
            lensType = lens;
            isLensValid = true;
        } else {
            System.out.println("lens type is not valid");
        }

        if (warrantyYears >= 0) {
            warranty = warrantyYears;
            isWarrantyValid = true;
        } else {
            System.out.println("warranty is not valid");
        }

        if (battery != null && !battery.isEmpty()) {
            batteryType = battery;
            isBatteryValid = true;
        } else {
            System.out.println("battery type is not valid");
        }

        if (cameraWeight > 0) {
            weight = cameraWeight;
            isWeightValid = true;
        } else {
            System.out.println("weight is not valid");
        }

        if (isBrandValid && isModelValid && isPriceValid &&
            isPixelsValid && isColorValid && isLensValid &&
            isWarrantyValid && isBatteryValid && isWeightValid) {

            nightVision = isNightVision;
            isCameraCreated = true;
        }

        return isCameraCreated;
    }

    public static void getCameraDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("MegaPixels: " + megaPixels);
        System.out.println("Color: " + color);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Night Vision: " + nightVision);
        System.out.println("Warranty: " + warranty);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Weight: " + weight);
        System.out.println("-----------------------------");
    }
}