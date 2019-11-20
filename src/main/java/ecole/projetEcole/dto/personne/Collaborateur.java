package ecole.projetEcole.dto.personne;

import ecole.projetEcole.dto.ecole.FormationDto;

import java.io.Serializable;

public class Collaborateur extends Personne implements Serializable {


    private String equipe;
    private FormationDto cycle;


    public Collaborateur(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance, String equipe, FormationDto cycle) {
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

    public FormationDto getCycle() {
        return cycle;
    }

    public void setCycle(FormationDto cycle) {
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
