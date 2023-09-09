package com.example.mvpjava.ui;

import com.example.mvpjava.pojo.ModelMovie;

public class MoviePresenter {
    MovieInterface view;

    public MoviePresenter(MovieInterface view) {
        this.view = view;
    }
    public ModelMovie getMovieFromDB(){
        return new ModelMovie(1,"The end","It is a boring movie");

    }
    public void getNameOfMovie(){
        view.OnGetMovie(getMovieFromDB().getMovieName());
    }


}// end MoviePresenter class
