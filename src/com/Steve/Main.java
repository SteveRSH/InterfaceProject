package com.Steve;

// For this activity you will be creating, extending and implementing interfaces.

// Write an abstract Soldier class with a few instance variables (e.g. name, rank, serialNumber).
// Write a few common methods for the behavior (e.g. sleep, eat, walk)
// and just return a String for something meaning (e.g. "snore", "chew", "trudge").

// Write an abstract method speak which returns a String.
// Each class that extends the FootSoldier class will have to implement the method
// (e.g. Marines could return "oohrah", Army could return "Hooah", Navy could return "Hooyah", ...).
// All of the methods you're writing will work this way; you can think of them as sound effects
// (punch => "Blamo!" or whatever you pick).




public class Main {

    public static void main(String[] args) {

        Bomb nBomb = new Bomb();
        System.out.println(nBomb);

        PrivateGump newSoldier = new PrivateGump("Connor", "5", 345, true);
	newSoldier.knives();
	newSoldier.hit();
    newSoldier.punch();
    newSoldier.run();

    ArmedForces newForces = new ArmedForces("Dan", "5", 123, true);
    newForces.speak();

    newSoldier.grenade();
    newSoldier.tank();

        System.out.println("A Soldiers Story?");
    }
}
