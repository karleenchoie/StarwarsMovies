package com.example.starwarsmovies.models;

import java.util.List;

public class FilmsResponse {
    private List<Films> results;

    public List<Films> getResults() {
        return results;
    }

    public void setResults(List<Films> results) {
        this.results = results;
    }
}