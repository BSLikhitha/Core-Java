class Playstore {

    static String appName;
    static String developer;
    static double size;
    static double rating;
    static int downloads;
    static String category;
    static boolean isFree;

    public static boolean createApp(String name, String dev,
                                    double appSize, double appRating,
                                    int totalDownloads,
                                    String appCategory,
                                    boolean free) {

        boolean isAppCreated = false;

        boolean isNameValid = false;
        boolean isDevValid = false;
        boolean isSizeValid = false;
        boolean isRatingValid = false;
        boolean isDownloadsValid = false;
        boolean isCategoryValid = false;

        if (name != null && !name.isEmpty()) {
            appName = name;
            isNameValid = true;
        } else {
            System.out.println("app name is not valid");
        }

        if (dev != null && !dev.isEmpty()) {
            developer = dev;
            isDevValid = true;
        } else {
            System.out.println("developer is not valid");
        }

        if (appSize > 0) {
            size = appSize;
            isSizeValid = true;
        } else {
            System.out.println("size is not valid");
        }

        if (appRating >= 0) {
            rating = appRating;
            isRatingValid = true;
        } else {
            System.out.println("rating is not valid");
        }

        if (totalDownloads >= 0) {
            downloads = totalDownloads;
            isDownloadsValid = true;
        } else {
            System.out.println("downloads is not valid");
        }

        if (appCategory != null && !appCategory.isEmpty()) {
            category = appCategory;
            isCategoryValid = true;
        } else {
            System.out.println("category is not valid");
        }

        if (isNameValid && isDevValid && isSizeValid &&
            isRatingValid && isDownloadsValid && isCategoryValid) {

            isFree = free;
            isAppCreated = true;
        }

        return isAppCreated;
    }

    public static void getAppDetails() {
        System.out.println("App Name     : " + appName);
        System.out.println("Developer    : " + developer);
        System.out.println("Size (MB)    : " + size);
        System.out.println("Rating       : " + rating);
        System.out.println("Downloads    : " + downloads);
        System.out.println("Category     : " + category);
        System.out.println("Free App     : " + isFree);
        System.out.println("------------------------------");
    }
}