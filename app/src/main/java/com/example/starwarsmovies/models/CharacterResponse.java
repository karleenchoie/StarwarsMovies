package com.example.starwarsmovies.models;

import java.util.List;

public class CharacterResponse
{
    private List<Character> results;

    public List<Character> getResults() {
        return results;
    }

    public void setResults(List<Character> results) {
        this.results = results;
    }
}