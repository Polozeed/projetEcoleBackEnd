package ecole.projetEcole.dto.personne;

import java.io.Serializable;
import java.util.Date;

public class Personne implements Serializable {


    private String nom;
    private String prenom;
    private String fonction;
    private String mail;
    private String numeroTel;
    private String dateNaissance;


    public Personne(String nom, String prenom, String fonction, String mail, String numeroTel, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.mail = mail;
        this.numeroTel = numeroTel;
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", mail='" + mail + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }
}
