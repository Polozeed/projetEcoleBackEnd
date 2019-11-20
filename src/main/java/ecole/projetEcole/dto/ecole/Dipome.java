package ecole.projetEcole.dto.ecole;

import java.io.Serializable;

public class Dipome implements Serializable {


    private String nomDiplome;
    private String commentaire;

    public Dipome(String nomDiplome, String commentaire) {
        this.nomDiplome = nomDiplome;
        this.commentaire = commentaire;
    }

    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Dipome{" +
                "nomDiplome='" + nomDiplome + '\'' +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
