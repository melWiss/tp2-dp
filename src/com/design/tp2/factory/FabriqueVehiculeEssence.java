package com.design.tp2.factory;

import com.design.tp2.factory.automobile.Automobile;
import com.design.tp2.factory.automobile.AutomobileEssence;
import com.design.tp2.factory.scooter.Scooter;
import com.design.tp2.factory.scooter.ScooterEssence;

public class FabriqueVehiculeEssence implements FabriqueVehicule{
    @Override
    public Automobile creeAutomobile() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter creeScooter() {
        return new ScooterEssence();
    }
}
