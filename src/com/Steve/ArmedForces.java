package com.Steve;

public class ArmedForces extends Soldier{

    public ArmedForces(String name, String rank, int serialNumber, boolean cadet) {
        super(name, rank, serialNumber, cadet);
    }

//    public String getString() { return "Get comfortable being uncomfortable";}

    @Override
    public String speak() {
        return "Private Pyle!!!!";

//        @Override
//        public String speak () {
//            return "Get comfortable being uncomfortable";
//        return null;

        }

    }


