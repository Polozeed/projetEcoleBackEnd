package ecole.projetEcole.dto.personne;

import ecole.projetEcole.dto.ecole.FormationDto;
import lombok.Data;

import java.io.Serializable;


@Data
public  class PersonneDto implements Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String fonction;
    private String mail;
    private String numeroTel;
    private String dateNaissance;
    private String commentaire;
    //private List<FormationDto> formations;
    private FormationDto formations;
    private String type;

}
