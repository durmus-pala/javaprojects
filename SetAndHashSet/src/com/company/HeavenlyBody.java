package com.company;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    public final String name;
    public final double orbitalPeriod;
    public final Set<HeavenlyBody> satellities;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellities = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public boolean addMoon(HeavenlyBody moon){
        return this.satellities.add(moon);
    }

    public Set<HeavenlyBody> getSatellities() {
        return new HashSet<> (this.satellities);
    }



    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        System.out.println("Obj.getClass is " + obj.getClass());
        System.out.println("This.getClass is " + this.getClass());

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode() called");
        return this.name.hashCode() + 57;
    }
}
