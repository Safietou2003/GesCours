package entities;

import java.util.ArrayList;

public class Classe {
    private String nom;
    private ArrayList<Etudiant> etudiants;

    public Classe(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }
}
