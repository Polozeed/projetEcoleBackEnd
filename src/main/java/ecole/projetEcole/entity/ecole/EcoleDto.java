package ecole.projetEcole.entity.ecole;

import java.io.Serializable;
import java.util.Objects;

public class EcoleDto implements Serializable {


    private String nom;
    private int nbEtudiants;
    private int adresse;
    private String specialite;

    /*
    private Personne directeur;
    private Personne respEnt;

    private List<Formation> cycle;


     */
    public EcoleDto() {

    }

    public EcoleDto(String nom, int nbEtudiants, int adresse, String specialite) {
        this.nom = nom;
        this.nbEtudiants = nbEtudiants;
        this.adresse = adresse;
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbEtudiants() {
        return nbEtudiants;
    }

    public void setNbEtudiants(int nbEtudiants) {
        this.nbEtudiants = nbEtudiants;
    }

    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "EcoleDto{" +
                "nom='" + nom + '\'' +
                ", nbEtudiants=" + nbEtudiants +
                ", adresse=" + adresse +
                ", specialite='" + specialite + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EcoleDto ecoleDto = (EcoleDto) o;
        return nbEtudiants == ecoleDto.nbEtudiants &&
                adresse == ecoleDto.adresse &&
                Objects.equals(nom, ecoleDto.nom) &&
                Objects.equals(specialite, ecoleDto.specialite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbEtudiants, adresse, specialite);
    }
}
