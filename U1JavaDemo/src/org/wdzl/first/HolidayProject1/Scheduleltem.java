package org.wdzl.first.HolidayProject1;

public class Scheduleltem {
    private String time;
    private Movie movie;

    public Scheduleltem()
    {

    }
    public Scheduleltem(String time, Movie movie) {
        this.time = time;
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
