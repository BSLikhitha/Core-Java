class MovieExecuter {

    public static void main(String[] args) {

        boolean v1 = Movie.createMovie("KGF","Prashanth Neel","Kannada",180,9.5,100);
        Movie.getMovieDetails();

        boolean v2 = Movie.createMovie("RRR","Rajamouli","Telugu",182,9.3,550);
        Movie.getMovieDetails();

        boolean v3 = Movie.createMovie("Baahubali","Rajamouli","Telugu",160,9.0,450);
        Movie.getMovieDetails();

        boolean v4 = Movie.createMovie("Inception","Christopher Nolan","English",148,8.8,160);
        Movie.getMovieDetails();

        boolean v5 = Movie.createMovie("Interstellar","Christopher Nolan","English",169,8.9,165);
        Movie.getMovieDetails();

        boolean v6 = Movie.createMovie("Avatar","James Cameron","English",162,8.5,237);
        Movie.getMovieDetails();

        boolean v7 = Movie.createMovie("Titanic","James Cameron","English",195,8.7,200);
        Movie.getMovieDetails();

        boolean v8 = Movie.createMovie("Jawan","Atlee","Hindi",169,7.8,300);
        Movie.getMovieDetails();

        boolean v9 = Movie.createMovie("Pathaan","Siddharth Anand","Hindi",146,7.2,250);
        Movie.getMovieDetails();

        boolean v10 = Movie.createMovie("Pushpa","Sukumar","Telugu",179,8.0,200);
        Movie.getMovieDetails();

        boolean v11 = Movie.createMovie("Vikram","Lokesh","Tamil",175,8.4,120);
        Movie.getMovieDetails();

        boolean v12 = Movie.createMovie("Leo","Lokesh","Tamil",165,7.9,300);
        Movie.getMovieDetails();

        boolean v13 = Movie.createMovie("Kantara","Rishab Shetty","Kannada",148,8.6,16);
        Movie.getMovieDetails();

        boolean v14 = Movie.createMovie("Ugramm","Prashanth Neel","Kannada",132,7.5,20);
        Movie.getMovieDetails();

        boolean v15 = Movie.createMovie("Salaar","Prashanth Neel","Telugu",170,8.2,400);
        Movie.getMovieDetails();

        boolean v16 = Movie.createMovie("Dangal","Nitesh Tiwari","Hindi",161,8.4,70);
        Movie.getMovieDetails();

        boolean v17 = Movie.createMovie("PK","Rajkumar Hirani","Hindi",153,8.1,85);
        Movie.getMovieDetails();

        boolean v18 = Movie.createMovie("3 Idiots","Rajkumar Hirani","Hindi",170,8.4,55);
        Movie.getMovieDetails();

        boolean v19 = Movie.createMovie("Jailer","Nelson","Tamil",168,7.7,200);
        Movie.getMovieDetails();

        boolean v20 = Movie.createMovie("Master","Lokesh","Tamil",179,7.8,135);
        Movie.getMovieDetails();

        boolean v21 = Movie.createMovie("Drishyam","Jeethu Joseph","Malayalam",160,8.6,15);
        Movie.getMovieDetails();

        boolean v22 = Movie.createMovie("Lucifer","Prithviraj","Malayalam",175,7.9,30);
        Movie.getMovieDetails();

        boolean v23 = Movie.createMovie("Premam","Alphonse","Malayalam",156,8.3,4);
        Movie.getMovieDetails();

        boolean v24 = Movie.createMovie("Sita Ramam","Hanu Raghavapudi","Telugu",163,8.5,30);
        Movie.getMovieDetails();

        boolean v25 = Movie.createMovie("Eega","Rajamouli","Telugu",145,7.7,26);
        Movie.getMovieDetails();

        boolean v26 = Movie.createMovie("Ghajini","AR Murugadoss","Tamil",183,7.6,65);
        Movie.getMovieDetails();

        boolean v27 = Movie.createMovie("Robot","Shankar","Tamil",188,7.1,130);
        Movie.getMovieDetails();

        boolean v28 = Movie.createMovie("Brahmastra","Ayan Mukerji","Hindi",167,5.8,410);
        Movie.getMovieDetails();

        boolean v29 = Movie.createMovie(null,"TestDirector","English",120,6.0,50);
        Movie.getMovieDetails();

        boolean v30 = Movie.createMovie("ErrorMovie",null,"English",120,6.0,50);
        Movie.getMovieDetails();

        boolean v31 = Movie.createMovie("InvalidLang","Dir","",120,6.0,50);
        Movie.getMovieDetails();

        boolean v32 = Movie.createMovie("ZeroDuration","Dir","English",0,5.0,20);
        Movie.getMovieDetails();

        boolean v33 = Movie.createMovie("NegativeBudget","Dir","English",120,5.0,-10);
        Movie.getMovieDetails();

        boolean v34 = Movie.createMovie("LowRating","Dir","English",120,-1,20);
        Movie.getMovieDetails();

        boolean v35 = Movie.createMovie("ShortFilm","NewDir","English",90,7.0,2);
        Movie.getMovieDetails();

        boolean v36 = Movie.createMovie("Indie","IndieDir","English",100,7.5,1);
        Movie.getMovieDetails();

        boolean v37 = Movie.createMovie("FinalMovie","FinalDir","English",140,8.0,60);
        Movie.getMovieDetails();
    }
}