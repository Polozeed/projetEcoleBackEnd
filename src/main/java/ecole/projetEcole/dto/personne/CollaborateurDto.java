package ecole.projetEcole.dto.personne;

import ecole.projetEcole.dto.ecole.FormationDto;
import lombok.*;

import java.io.Serializable;



@Data
public class CollaborateurDto extends PersonneDto implements Serializable {


    private String equipe;
    private FormationDto cycle;

    public CollaborateurDto(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance) {
        super(nom, prenom, fonction, mail, numeroTel, dateNaissance);
    }

    public CollaborateurDto(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance, String equipe, FormationDto cycle) {
        super(nom, prenom, fonction, mail, numeroTel, dateNaissance);
        this.equipe = equipe;
        this.cycle = cycle;
    }
}
