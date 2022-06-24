package com.design.tp2;

import com.design.tp2.factory.Catalogue;

public class Main {
    public static void main(String[] args) {
        Catalogue c = new Catalogue();
        c.getA1().featuresDisplay();
        c.getA2().featuresDisplay();
        c.getS1().featuresDisplay();
        c.getS2().featuresDisplay();
    }
}
