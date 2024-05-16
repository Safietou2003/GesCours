package views;

import services.ProfesseurService;
import services.CoursService;
import entities.Professeur;
import entities.Cours;
import entities.Classe;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ProfesseurService professeurService = new ProfesseurService();
        CoursService coursService = new CoursService();

        Scanner scanner = new Scanner(System.in);
        int choix;
        Professeur professeur = null; 
        do {
            choix = menu();
            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom du professeur : ");
                    String nomProfesseur = scanner.nextLine();
                    System.out.println("Entrez le prénom du professeur : ");
                    String prenomProfesseur = scanner.nextLine();
                    professeur = new Professeur(nomProfesseur, prenomProfesseur); 
                    professeurService.ajouterProfesseur(professeur);
                    break;
                case 2:
                    professeurService.listerProfesseurs();
                    break;
                case 3:
                    if (professeur == null) {
                        System.out.println("Veuillez d'abord ajouter un professeur.");
                        break;
                    }
                    System.out.println("Entrez l'ID du cours : ");
                    String idCours = scanner.nextLine();
                    System.out.println("Entrez le module du cours : ");
                    String module = scanner.nextLine();
                    ArrayList<Classe> classes = new ArrayList<>();
                    Cours cours = new Cours(idCours, LocalDate.now(), LocalTime.now(), LocalTime.now().plusHours(2), professeur, classes, module);
                    coursService.creerCours(cours);
                    break;
                case 4:
                    coursService.listerCours();
                    break;
                case 5:
                    if (professeur == null) {
                        System.out.println("Veuillez d'abord ajouter un professeur.");
                        break;
                    }
                    coursService.listerCoursProfesseur(professeur);
                    break;
                case 6:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
                    break;
            }
        } while (choix != 6);

        scanner.close();
    }

    public static int menu() {
        System.out.println("1- Ajouter un Professeur");
        System.out.println("2- Lister les Professeurs");
        System.out.println("3- Créer un cours");
        System.out.println("4- Lister les tous les cours");
        System.out.println("5- Lister les les cours d’un professeur");
        System.out.println("6- Quitter");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        scanner.close(); 
        return choice;
    }
}

