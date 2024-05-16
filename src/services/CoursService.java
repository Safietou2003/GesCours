package services;

import entities.Cours;
import entities.Professeur;
import entities.Classe;
import java.util.ArrayList;

public class CoursService {
    private ArrayList<Cours> cours = new ArrayList<>();

    public void creerCours(Cours cours) {
        this.cours.add(cours);
    }
    
    public void listerCours() {
        for (Cours cours : this.cours) {
            System.out.println(cours.getId() + " " + cours.getDate() + " " + cours.getHeureDb() + " " + cours.getHeureFin() + " " + cours.getProfesseur().getNom() + " " + cours.getModule());
            for (Classe classe : cours.getClasses()) {
                System.out.println("Classe: " + classe.getNom());
            }
        }
    }
    
    public void listerCoursProfesseur(Professeur professeur) {
        for (Cours cours : this.cours) {
            if (cours.getProfesseur().equals(professeur)) {
                System.out.println(cours.getId() + " " + cours.getDate() + " " + cours.getHeureDb() + " " + cours.getHeureFin() + " " + cours.getProfesseur().getNom() + " " + cours.getModule());
                for (Classe classe : cours.getClasses()) {
                    System.out.println("Classe: " + classe.getNom());
                }
            }
        }
    }
}    