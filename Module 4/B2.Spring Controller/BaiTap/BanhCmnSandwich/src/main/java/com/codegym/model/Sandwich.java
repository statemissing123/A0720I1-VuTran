package com.codegym.model;

import java.util.List;

public class Sandwich {
    private List<String> giavi;

    public Sandwich() {
    }

    public Sandwich(List<String> giavi) {
        this.giavi = giavi;
    }

    public List<String> getGiavi() {
        return giavi;
    }

    public void setGiavi(List<String> giavi) {
        this.giavi = giavi;
    }
}
