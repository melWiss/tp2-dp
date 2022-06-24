package com.design.tp2.factory.automobile;

public abstract class Automobile {
    private String couleur, modele;
    private double puissance;



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
}
