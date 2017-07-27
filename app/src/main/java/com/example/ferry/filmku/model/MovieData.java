package com.example.ferry.filmku.model;

import java.util.List;


public class MovieData {
    public int page;
    public List<Result> results;
    public int total_results;
    public int total_pages;

    public class Result
    {
        public String poster_path;
        public boolean adult;
        public String overview;
        public String release_date;
        public List<Integer> genre_ids;
        public int id;
        public String original_title;
        public String original_language;
        public String title;
        public String backdrop_path;
        public double popularity;
        public int vote_count;
        public boolean video;
        public double vote_average;
    }
}
