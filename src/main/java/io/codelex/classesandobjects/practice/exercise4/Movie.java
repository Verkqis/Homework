package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

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

    public ArrayList getPG(ArrayList<Movie> movies) {

        ArrayList<String> Movie = new ArrayList<String>();
        for (String el : Movie) {
            if ("PG".equals(Movie)) {
                Movie.add(el);
            }
        }

        return Movie;
    }

    public String getRating() {
        return rating;
    }
}
