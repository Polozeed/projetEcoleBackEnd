package ecole.projetEcole.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ecole", schema = "Projet_Ecole", catalog = "")
public class EcoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ecole")
    private int idEcole;

    @Column(name = "nom")
    private String nom;
    @Column(name = "nb_etudiant")
    private int nbEtudiants;

    @Column(name = "id_adresse")
    private int adresse;

    @Column(name = "specialite")
    private String specialite;

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public int getIdEcole() {
        return idEcole;
    }

    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
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
        return "Ecole{" +
                "idEcole=" + idEcole +
                ", nom='" + nom + '\'' +
                ", nbEtudiants=" + nbEtudiants +
                ", adresse=" + adresse +
                ", specialite='" + specialite + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EcoleEntity ecole = (EcoleEntity) o;
        return idEcole == ecole.idEcole &&
                nbEtudiants == ecole.nbEtudiants &&
                adresse == ecole.adresse &&
                Objects.equals(nom, ecole.nom) &&
                Objects.equals(specialite, ecole.specialite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEcole, nom, nbEtudiants, adresse, specialite);
    }
}
