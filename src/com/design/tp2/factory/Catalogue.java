package com.design.tp2.factory;

import com.design.tp2.factory.automobile.Automobile;
import com.design.tp2.factory.automobile.AutomobileEssence;
import com.design.tp2.factory.scooter.Scooter;

public class Catalogue {
    private FabriqueVehicule fel = new FabriqueVehiculeElectricite();
    private FabriqueVehicule fes = new FabriqueVehiculeEssence();

    private Automobile a1 = fel.creeAutomobile();
    private Automobile a2 = fes.creeAutomobile();

    private Scooter s1 = fel.creeScooter();
    private Scooter s2 = fes.creeScooter();

    public Automobile getA1() {
        return a1;
    }

    public void setA1(Automobile a1) {
        this.a1 = a1;
    }

    public Automobile getA2() {
        return a2;
    }

    public void setA2(Automobile a2) {
        this.a2 = a2;
    }

    public Scooter getS1() {
        return s1;
    }

    public void setS1(Scooter s1) {
        this.s1 = s1;
    }

    public Scooter getS2() {
        return s2;
    }

    public void setS2(Scooter s2) {
        this.s2 = s2;
    }
}
