package com.Steve;


// Write a few common methods for the behavior (e.g. sleep, eat, walk) and just return a String
// for something meaning (e.g. "snore", "chew", "trudge").

//Write an abstract Soldier class with a few instance variables (e.g. name, rank, serialNumber).

public abstract class Soldier {
    public String name;
    public String rank;
    public int serialNumber;
    public boolean cadet;

////multi argument constructor

public Soldier (
        String name,
        String rank,
        int serialNumber,
        boolean cadet) {

    this.name = name;
    this.rank = rank;
    this.serialNumber = serialNumber;
    this.cadet = cadet;

    }

    public String snore(){
        return "ZZZZzzzzzz";
    }

    public String chant(){
        return "left, right, left";
    }

    public String eat(){
        return "To the mess hall";


    }


    public abstract String speak();


}
