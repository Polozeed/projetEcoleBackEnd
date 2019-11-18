package ecole.projetEcole.dto.personne;

import java.io.Serializable;
import java.util.Date;

public class Contact extends Personne implements Serializable {


    private String commentaire;

    public Contact(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance, String commentaire) {
        super(nom, prenom, fonction, mail, numeroTel, dateNaissance);
        this.commentaire = commentaire;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "commentaire='" + commentaire + '\'' +
                '}';
    }
}
