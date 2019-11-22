package ecole.projetEcole.dto.ecole;

import lombok.*;

import java.io.Serializable;

@Data
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



}
