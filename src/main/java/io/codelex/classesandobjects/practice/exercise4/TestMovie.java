package io.codelex.classesandobjects.practice.exercise4;

public class TestMovie {


    public static void main(String[] args) {

        Movie firstMovie = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie secondMovie = new Movie("Glass", "Buena Vista International", "PG13");
        Movie thirdMovie = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = {
                firstMovie,
                secondMovie,
                thirdMovie
        };


        firstMovie.getPG(movies);

    }


}

