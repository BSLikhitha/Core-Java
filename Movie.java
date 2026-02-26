class Movie {

    static String movieName;
    static String director;
    static String language;
    static int duration;
    static double rating;
    static double budget;

    public static boolean createMovie(String name, String dir, String lang,
                                      int time, double rate, double cost) {

        boolean isMovieCreated = false;

        if (name != null && !name.isEmpty()) movieName = name;
        else return false;

        if (dir != null && !dir.isEmpty()) director = dir;
        else return false;

        if (lang != null && !lang.isEmpty()) language = lang;
        else return false;

        if (time > 0) duration = time;
        else return false;

        if (rate >= 0) rating = rate;
        else return false;

        if (cost > 0) budget = cost;
        else return false;

        isMovieCreated = true;
        return isMovieCreated;
    }

    public static void getMovieDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Director: " + director);
        System.out.println("Language: " + language);
        System.out.println("Duration: " + duration);
        System.out.println("Rating: " + rating);
        System.out.println("Budget: " + budget);
    }
}