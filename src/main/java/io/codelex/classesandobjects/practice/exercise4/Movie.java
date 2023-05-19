package io.codelex.classesandobjects.practice.exercise4;

import java.util.Arrays;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    public Movie(String movieTitle, String movieStudio, String movieRating) {
        this.title = movieTitle;
        this.studio = movieStudio;
        this.rating = movieRating;
    }

    public Movie(String movieTitle, String movieStudio) {
        this.title = movieTitle;
        this.studio = movieStudio;
        this.rating = "PG";
    }


    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }

    public void getPG(Movie[] movie) {
        Movie[] withPG = new Movie[10];
        int count = 0;

        for (int i = 0; i < movie.length; i++) {
            if (movie[i].getRating().equals("PG")) {
                withPG[count] = movie[i];
                count++;
                System.out.println("This is PG Movie! ");
            } else {
                System.out.println("Didnt find PG Movie! ");
            }

        }
        System.out.println(Arrays.deepToString(withPG));
    }


    @Override
    public String toString() {
        return title + " " +
                studio + " " +
                rating + " ";
    }
}
