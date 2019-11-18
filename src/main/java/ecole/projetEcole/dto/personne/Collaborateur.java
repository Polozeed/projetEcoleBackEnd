package ecole.projetEcole.dto.personne;

import ecole.projetEcole.dto.ecole.Formation;

import java.io.Serializable;
import java.util.Date;

public class Collaborateur extends Personne implements Serializable {


    private String equipe;
    private Formation cycle;


    public Collaborateur(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance, String equipe, Formation cycle) {
        super(nom, prenom, fonction, mail, numeroTel, dateNaissance);
        this.equipe = equipe;
        this.cycle = cycle;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Formation getCycle() {
        return cycle;
    }

    public void setCycle(Formation cycle) {
        this.cycle = cycle;
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "equipe='" + equipe + '\'' +
                ", cycle=" + cycle +
                '}';
    }
}
