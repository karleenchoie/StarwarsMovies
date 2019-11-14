package com.example.starwarsmovies.models;

import java.util.List;

public class PlanetsResponse {

        private List<Planets> results;

        public List<Planets> getResults() {
        return results;
    }

        public void setResults(List<Planets> results) {
        this.results = results;
    }
}