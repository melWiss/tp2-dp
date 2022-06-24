package com.design.tp2.factory;

import com.design.tp2.factory.automobile.Automobile;
import com.design.tp2.factory.scooter.Scooter;

public interface FabriqueVehicule {
    public Automobile creeAutomobile();
    public Scooter creeScooter();
}
