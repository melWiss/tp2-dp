package com.design.tp2.factory;

import com.design.tp2.factory.automobile.Automobile;
import com.design.tp2.factory.automobile.AutomobileElectricite;
import com.design.tp2.factory.scooter.Scooter;
import com.design.tp2.factory.scooter.ScooterElectricite;

public class FabriqueVehiculeElectricite implements FabriqueVehicule{
    @Override
    public Automobile creeAutomobile() {
        return new AutomobileElectricite();
    }

    @Override
    public Scooter creeScooter() {
        return new ScooterElectricite();
    }
}
