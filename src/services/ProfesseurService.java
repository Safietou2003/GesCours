package services;

import entities.Professeur;
import java.util.ArrayList;

public class ProfesseurService {
    private ArrayList<Professeur> professeurs = new ArrayList<>();

    public void ajouterProfesseur(Professeur professeur) {
        professeurs.add(professeur);
    }

    public void listerProfesseurs() {
        for (Professeur professeur : professeurs) {
            System.out.println(professeur.getNom() + " " + professeur.getPrenom());
        }
    }
}
