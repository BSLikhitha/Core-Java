class MedicoPharma {

    static String medicineName;
    static String company;
    static double price;
    static String composition;
    static String dosage;
    static boolean prescriptionRequired;
    static int expiryYear;

    public static boolean createMedicine(String medName, String companyName,
                                         double cost, String content,
                                         String dose, boolean prescription,
                                         int year) {

        boolean isMedicineCreated = false;

        boolean isNameValid = false;
        boolean isCompanyValid = false;
        boolean isPriceValid = false;
        boolean isCompositionValid = false;
        boolean isDosageValid = false;
        boolean isExpiryValid = false;

        if (medName != null && !medName.isEmpty()) {
            medicineName = medName;
            isNameValid = true;
        }

        if (companyName != null && !companyName.isEmpty()) {
            company = companyName;
            isCompanyValid = true;
        }

        if (cost > 0) {
            price = cost;
            isPriceValid = true;
        }

        if (content != null && !content.isEmpty()) {
            composition = content;
            isCompositionValid = true;
        }

        if (dose != null && !dose.isEmpty()) {
            dosage = dose;
            isDosageValid = true;
        }

        if (year > 2023) {
            expiryYear = year;
            isExpiryValid = true;
        }

        if (isNameValid && isCompanyValid && isPriceValid &&
            isCompositionValid && isDosageValid && isExpiryValid) {

            prescriptionRequired = prescription;
            isMedicineCreated = true;
        }

        return isMedicineCreated;
    }

    public static void getMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Company: " + company);
        System.out.println("Price: " + price);
        System.out.println("Expiry Year: " + expiryYear);
    }
}