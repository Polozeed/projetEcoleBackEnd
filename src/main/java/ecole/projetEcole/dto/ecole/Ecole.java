package ecole.projetEcole.dto.ecole;

import ecole.projetEcole.dto.Adresse;
import ecole.projetEcole.dto.personne.Personne;

import java.io.Serializable;
import java.util.List;

public class Ecole implements Serializable {


    private String nom;
    private long nbEtudiants;
    private Adresse adresse;
    private Personne directeur;
    private Personne respEnt;
    private String specialite;
    private List<Formation> cycle;

    public Ecole(String nom, long nbEtudiants, Adresse adresse, Personne directeur, Personne respEnt, String specialite, List<Formation> cycle) {
        this.nom = nom;
        this.nbEtudiants = nbEtudiants;
        this.adresse = adresse;
        this.directeur = directeur;
        this.respEnt = respEnt;
        this.specialite = specialite;
        this.cycle = cycle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNbEtudiants() {
        return nbEtudiants;
    }

    public void setNbEtudiants(long nbEtudiants) {
        this.nbEtudiants = nbEtudiants;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Personne getDirecteur() {
        return directeur;
    }

    public void setDirecteur(Personne directeur) {
        this.directeur = directeur;
    }

    public Personne getRespEnt() {
        return respEnt;
    }

    public void setRespEnt(Personne respEnt) {
        this.respEnt = respEnt;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public List<Formation> getCycle() {
        return cycle;
    }

    public void setCycle(List<Formation> cycle) {
        this.cycle = cycle;
    }

    @Override
    public String toString() {
        return "Ecole{" +
                "nom='" + nom + '\'' +
                ", nbEtudiants=" + nbEtudiants +
                ", adresse=" + adresse +
                ", directeur=" + directeur +
                ", respEnt=" + respEnt +
                ", specialite='" + specialite + '\'' +
                ", cycle=" + cycle +
                '}';
    }
}
