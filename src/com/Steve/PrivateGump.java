package com.Steve;

public class PrivateGump extends Soldier implements Weapons {

    public PrivateGump(String name, String rank, int serialNumber, boolean cadet) {
        super(name, rank, serialNumber, cadet);

        this.name = "Gump";
        this.rank = "A1";
        this.serialNumber = 349;
        this.cadet = true;

        System.out.println("A Soldiers Story?");

    }


//    public PrivateGump() {
//        this.name = "Gump";
//        this.rank = "A1";
//        this.serialNumber = 349;
//        this.cadet = true;
//    }

    public String punch() {
        return "BAM!!!!";
    }

    public String hit() {
        return "Ouch";
    }

    public int knives() {
        return 5;
    }

    public boolean run() {
        return true;
    }

    @Override
    public String speak() {
        return "Get comfortable being uncomfortable";

    }

    @Override
    public String grenade() {
        return null;
    }

    @Override
    public String tank() {
        return null;
    }
}

