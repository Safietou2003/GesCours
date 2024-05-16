package services;
import entities.Classe;
import java.util.ArrayList;
public class ClasseService {
    private ArrayList<Classe> classes = new ArrayList<>();

    public void ajouterClasse(Classe classe) {
        classes.add(classe);
    }

    public void listerClasses() {
        for (Classe classe : classes) {
            System.out.println(classe.getNom());
        }
    }
    
}
