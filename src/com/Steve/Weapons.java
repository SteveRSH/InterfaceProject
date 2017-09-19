package com.Steve;

public interface Weapons {
    public String grenade();

    public String tank();



    default String semiAutomatic(){
        return "pop";
    }

}
