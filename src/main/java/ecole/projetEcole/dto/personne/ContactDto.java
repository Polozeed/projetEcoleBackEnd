package ecole.projetEcole.dto.personne;

import lombok.*;

import java.io.Serializable;


@Data
public class ContactDto extends PersonneDto implements Serializable {


    private String commentaire;
    private int idEcole;
    private int idFormation;

    public ContactDto(){
        super();
    }

    public ContactDto(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance, String commentaire, int idEcole, int idFormation) {
        super(nom, prenom, fonction, mail, numeroTel, dateNaissance);
        this.commentaire = commentaire;
        this.idEcole = idEcole;
        this.idFormation = idFormation;
    }
}
