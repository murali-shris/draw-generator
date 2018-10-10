package com.tournament.draw.domain;

import java.util.Date;

public class Player {

    private String name;
    private Category category;
    private int seed;
    private String academyName;
    private Date dateOfBirth;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Player(String name, int seed, String academyName) {
        this.name = name;
        this.seed = seed;
        this.academyName = academyName;
    }


}
