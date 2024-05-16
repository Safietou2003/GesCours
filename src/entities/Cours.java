package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cours {
    private String id;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private Professeur professeur;
    private ArrayList<Classe> classes;
    private String module;

    public Cours(String id, LocalDate date, LocalTime heureDb, LocalTime heureFin, Professeur professeur, ArrayList<Classe> classes, String module) {
        this.id = id;
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.classes = classes;
        this.module = module;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDb() {
        return heureDb;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public ArrayList<Classe> getClasses() {
        return classes;
    }

    public String getModule() {
        return module;
    }
}
