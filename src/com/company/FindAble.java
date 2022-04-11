package com.company;

import java.util.List;

public interface FindAble {


    void findMoviesByActor(List<Movies> movies, String actorsName);

    void findMoviesByDirector(List<Movies> movies, String directorsName);

    void findMoviesByYear(List<Movies> movies, int year);

    void findMoviesAndRoleByActor(List<Movies> movies, String title);

    void showActorRoles(List<Movies> movies);
}
