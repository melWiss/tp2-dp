package com.design.tp2.factory.scooter;

public abstract class Scooter {
    private String couleur, modele;
    private double puissance, tailleRoue;

    public abstract void featuresDisplay();

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public double getTailleRoue() {
        return tailleRoue;
    }

    public void setTailleRoue(double tailleRoue) {
        this.tailleRoue = tailleRoue;
    }
}
