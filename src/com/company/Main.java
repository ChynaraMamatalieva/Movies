package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Movies> movies = JsonIO.getMovies();
    private static MovieStore s =  new MovieStore();
    private static FindByMap f = new FindByMap();
    private static Scanner in = new Scanner(System.in);

    private static Scanner sc1 = new Scanner(System.in);
    public static void main(String[] args) throws InputException {
//        while (true) {
//            start();
//        }
        commands();
        int a = in.nextInt();
        switch (a) {
            case 1:
                s.printAllMovies(movies);
                break;
            case 2:
                System.out.println("What movie you want watch: ");
                String input = sc1.nextLine();
                s.findMovie(movies, input);
                break;
            case 3:
                s.sortByYear(movies);
                break;
            case 4:
                s.sortByName(movies);
                break;
            case 5:
                s.sortByDirector(movies);
                break;
            case 6:
                String input1 = sc1.nextLine();
                f.findMoviesByActor(movies, input1);
                break;
            case 7:
                String input2 = sc1.nextLine();
                f.findMoviesByDirector(movies, input2);
                break;
            case 8:
                int input3 = sc1.nextInt();
                f.findMoviesByYear(movies, input3);
                break;
            case 9:
                String input4 = sc1.nextLine();
                f.findMoviesAndRoleByActor(movies,input4);
                break;
            case 10:
                f.showActorRoles(movies);
                break;



        }
    }


    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }

    static int getInt() {
        System.out.print("Write year ");
        int a = 0;
        try {
            String b = in.next();
            a = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Wrong again, try again");
            e.printStackTrace();
        }
        return a;
    }
}
