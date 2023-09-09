package com.example.mvpjava.pojo;

public class ModelMovie {
    int id;
    String movieName;
    String DescriptionMovie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDescriptionMovie() {
        return DescriptionMovie;
    }

    public void setDescriptionMovie(String descriptionMovie) {
        DescriptionMovie = descriptionMovie;
    }

    public ModelMovie(int id, String movieName, String descriptionMovie) {
        this.id = id;
        this.movieName = movieName;
        DescriptionMovie = descriptionMovie;
    }
}
