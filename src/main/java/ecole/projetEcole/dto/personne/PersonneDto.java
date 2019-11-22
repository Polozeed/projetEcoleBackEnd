package ecole.projetEcole.dto.personne;

import lombok.*;

import java.io.Serializable;


@Data
public abstract class PersonneDto implements Serializable {

    private String nom;
    private String prenom;
    private String fonction;
    private String mail;
    private String numeroTel;
    private String dateNaissance;
    private String commentaire;

    public PersonneDto(){
    }


    public PersonneDto(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.mail = mail;
        this.numeroTel = numeroTel;
        this.dateNaissance = dateNaissance;
    }

}
